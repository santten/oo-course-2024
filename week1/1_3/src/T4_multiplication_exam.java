import java.util.Scanner;

public class T4_multiplication_exam {
    public static void main(String[] args) {
        System.out.printf("⭐ Multiplication Exam ⭐ %n");
        Scanner scanner = new Scanner(System.in);

        int correct = 0;
        while (correct < 10) {
            for (int i = 1; i <= 10; i++) {
                int int1 = (int) (Math.random() * 11);
                int int2 = (int) (Math.random() * 11);
                System.out.printf("====================%nQuestion %s/10: %s * %s %n", i, int1, int2);
                int userResponse = Integer.parseInt(scanner.nextLine());

                if (userResponse == (int1 * int2)) {
                    System.out.println("Correct!");
                    correct++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + (int1 * int2));
                }

                if (i == 10) {
                    if (correct == 10) {
                        System.out.printf("%s/10 questions correct. Congratulations!", correct);
                    } else {
                        System.out.printf("%s/10 questions correct. Retake the exam!%n", correct);
                        correct = 0;
                    }
                }
            }
        }
    }
}
