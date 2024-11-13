package W3_4_T2;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        List<BigInteger> fibonacciSequence = generateFibonacciSequence(100);
        writeColumnToCSV(fibonacciSequence, "fibonacci.csv");
    }

    public static List<BigInteger> generateFibonacciSequence(int count) {
        List<BigInteger> sequence = new ArrayList<>();
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);

        sequence.add(a);
        sequence.add(b);
        for (int i = 0; i < count - 2; i++) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
            sequence.add(next);
        }
        return sequence;
    }

    public static void writeColumnToCSV(List<BigInteger> sequence, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (BigInteger value : sequence) {
                writer.append(value.toString()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}