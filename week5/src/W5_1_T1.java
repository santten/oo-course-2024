import java.util.Scanner;

class Counter implements Runnable {
    private int current;
    private final int waitTime;
    private final String title;
    private final int max;

    public Counter(int firstNum, String title, int max, int waitTimeInMs) {
        this.current = firstNum;
        this.title = title;
        this.max = max;
        this.waitTime = waitTimeInMs;
    }

    @Override
    public void run() {
        while (current <= max) {
            try {
                System.out.println(title + ": " + current);
                current += 2;
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class W5_1_T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max integer where the counters should count to: ");
        int max = scanner.nextInt();

        System.out.println("Enter wait time between integers of Odd Thread (in milliseconds): ");
        int waitTime1 = scanner.nextInt();

        System.out.println("Enter wait time between integers of Even Thread (in milliseconds): ");
        int waitTime2 = scanner.nextInt();

        System.out.println("Starting threads...");

        Runnable oddCounter = new Counter(1, "Odd Thread", max, waitTime1);
        Runnable evenCounter = new Counter(2, "Even Thread", max, waitTime2);

        Thread oddT = new Thread(oddCounter);
        Thread evenT = new Thread(evenCounter);

        oddT.start();
        evenT.start();
    }
}
