import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

class ArraySum implements Runnable {
    private final List<BigInteger> list;
    private BigInteger total;

    public ArraySum(List<BigInteger> list) {
        this.list = list;
        this.total = BigInteger.ZERO;
    }

    public BigInteger getTotal() {
        return this.total;
    }

    @Override
    public void run() {
        for (BigInteger i : list){
            this.total = this.total.add(i);
        }
        System.out.println("Calculation completed! partition size: " + this.list.size() + " || partition sum: " + getTotal());
        Thread.yield();
    }
}

public class W5_1_T2 {
    public static void main(String[] args) {
        /* generating random integers for an array of given size */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size (100000 recommended):");
        int arrSize = scanner.nextInt();
        System.out.println("Generating array of " + arrSize + " integers...");

        ArrayList<BigInteger> numberArr = new ArrayList<>();
        for (int i = 0; i < arrSize; i++){
            Random ran = new Random();
            numberArr.add(BigInteger.valueOf(Math.abs(ran.nextInt())));
        }

        /* dividing parts of the array for different cores to process,
        * creating lists of the ongoing threads and summers and casting
        * to them according to core amount */
        int processorAmt = Runtime.getRuntime().availableProcessors();
        List<ArraySum> summers = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < processorAmt; i++) {
            List<BigInteger> splitIntegers = numberArr.subList(i * (numberArr.size() / processorAmt), i == processorAmt - 1 ? numberArr.size() : (i + 1) * (numberArr.size() / processorAmt));
            ArraySum summer = new ArraySum(splitIntegers);
            Thread t = new Thread(summer);
            summers.add(summer);
            threads.add(t);
            t.start();
        }

        /* join threads together:
        keep program from proceeding before threads have died */
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /* sum and print the total sum gathered by the summers */
        BigInteger totalSum = BigInteger.ZERO;
        for (ArraySum summer : summers) {
            totalSum = totalSum.add(summer.getTotal());
        }
        System.out.println("Total sum of the random " + arrSize + " integers: " + totalSum);
    }
}
