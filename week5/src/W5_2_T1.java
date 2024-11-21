import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Customer {
    private static final AtomicInteger customerID = new AtomicInteger(1);
    private final int id;

    public Customer(){
        this.id = customerID.getAndIncrement();
    }

    public int getCustomerID(){
        return this.id;
    }
}

class MovieTheater implements Runnable {
    private int ticketsLeft;
    private int customersToArrive;

    public MovieTheater(int ticketsLeft, int customersToArrive){
        this.ticketsLeft = ticketsLeft;
        this.customersToArrive = customersToArrive;
    }

    public synchronized void reserveTickets(Customer buyer, int amount){
        String threadName = Thread.currentThread().getName();
        if (getTicketsLeft() >= amount && amount > 0){
            System.out.printf("[%s tickets left] || Customer #%s is reserving %s tickets at %s%n", getTicketsLeft(), buyer.getCustomerID(), amount, threadName);
            ticketsLeft -= amount;
        } else {
            System.out.printf("[%s tickets left] || Customer #%s tried to reserve %s tickets at %s, but couldn't %n", getTicketsLeft(), buyer.getCustomerID(), amount, threadName);
        }
    }

    public int getTicketsLeft(){
        return this.ticketsLeft;
    }

    public void run(){
        while (customersToArrive > 0){
            customersToArrive--;
            Customer customer = new Customer();
            Random ran = new Random();
            int ticketAmount = ran.nextInt(3) + 1;
            reserveTickets(customer, ticketAmount);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Thread.yield();
    }
}

public class W5_2_T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many tickets should this show initially have?");
        int theaterCapacity = scanner.nextInt();
        System.out.println("How many customers should arrive this session?");
        int customerAmt = scanner.nextInt();

        System.out.printf("%nWELCOME TO MOVIE THEATER!%nInitial ticket amount: %s tickets %n%s customers are going to arrive%n%n", theaterCapacity, customerAmt);

        MovieTheater theater = new MovieTheater(theaterCapacity, customerAmt);

        Thread cashRegister1 = new Thread(theater, "Cash Register #1");
        Thread cashRegister2 = new Thread(theater, "Cash Register #2");

        cashRegister1.start();
        cashRegister2.start();

        try {
            cashRegister1.join();
            cashRegister2.join();
        } catch (InterruptedException e) {e.printStackTrace();}

        System.out.printf("%nAll customers have been handled! %nTickets sold: %s/%s%n", theaterCapacity-theater.getTicketsLeft(), theaterCapacity);
    }
}