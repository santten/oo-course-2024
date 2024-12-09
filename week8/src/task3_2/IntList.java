package task3_2;

import java.util.ArrayList;
import java.util.Arrays;

public class IntList {
    public static void main(String[] args) {
        ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

        System.out.println("Original List: ");
        for (Integer num : intList1) {
            System.out.printf("%s ", num);
        }

        intList1.removeIf(num -> num % 2 == 0);
        System.out.println("\nFiltered List (odd numbers only): ");
        for (Integer num : intList1) {
            System.out.printf("%s ", num);
        }

        intList1.replaceAll(num -> num * 2);
        System.out.println("\nReplaced List (doubled every number): ");
        for (Integer num : intList1) {
            System.out.printf("%s ", num);
        }

        final int[] sum = {0};
        intList1.forEach(num -> sum[0] += num);
        System.out.println("\nSum of List:\n" + sum[0]);
    }
}
