import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class T3_remove_duplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Remove Duplicates%n" +
                "====================================" +
                "%nEnter the size of your array: ");
        int arraySize = Integer.parseInt(scanner.nextLine());
        int[] userNumbers = new int[arraySize];

        // creating array with user input
        for (int i = 0; i < arraySize; i++) {
            System.out.printf("Enter %s. integer: ", i + 1);
            int thisInteger = Integer.parseInt(scanner.nextLine());
            userNumbers[i] = thisInteger;
            // System.out.printf("Number at index %s (shown to user as %s): %s %n", i, i + 1, userNumbers[i]);
        }

        System.out.printf("====================================%nYour Array: %s", Arrays.toString(userNumbers));

        // combing through the complete array and inserting only uniques to the new array (ArrayList)
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int num : userNumbers) {
            boolean test = newArr.contains(num);
            if (!test) {
                newArr.add(num);
            } // else { System.out.printf("%nDuplicate %s found", num); }
        }

        System.out.printf("%nArray with duplicates removed %s", newArr);
    }
}