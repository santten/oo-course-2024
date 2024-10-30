import java.util.Arrays;
import java.util.Scanner;

public class T2_subarray_sum {
    public static void main(String[] args){
        System.out.printf("Largest Subarray Sum%n" +
                "====================================" +
                "%nEnter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[arraySize];

        // creating array with user input
        for (int i = 0; i < arraySize; i++){
            System.out.printf("Enter %s. integer: ", i + 1);
            int thisInteger = Integer.parseInt(scanner.nextLine());
            numbers[i] = thisInteger;
            // System.out.printf("Number at index %s (shown to user as %s): %s %n", i, i+1, numbers[i]);
        }

        // System.out.println(Arrays.toString(numbers));

        // combing through the complete array
        int largestIndex = 0, secondLargestIndex = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > numbers[largestIndex]){
                secondLargestIndex = largestIndex;
                largestIndex = i;
                // System.out.printf("%nNEW largest number found at position %s: %s%nNumber at %s (%s) is now second largest.", i, numbers[i], secondLargestIndex, numbers[secondLargestIndex]);
            } else if (numbers[largestIndex] >= numbers[i] && numbers[i] >= numbers[secondLargestIndex]){
                secondLargestIndex = i;
                // System.out.printf("%nNEW second largest number found at position %s: %s", i, numbers[i]);
            }
        }

        // System.out.printf("%nLargest number in array: %s || Second largest number in array: %s" , numbers[largestIndex], numbers[secondLargestIndex]);
        System.out.printf(
                "%n====================================%nYour full array: %s" +
                "%nThe largest subarray sum consists of numbers at positions %s and %s, which are %s and %s. " +
                "%nTheir sum is %s.%n====================================", Arrays.toString(numbers), largestIndex + 1, secondLargestIndex + 1, numbers[largestIndex], numbers[secondLargestIndex], numbers[largestIndex] + numbers[secondLargestIndex]);
    }
}