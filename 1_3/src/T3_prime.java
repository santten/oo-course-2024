import java.util.Scanner;

public class T3_prime {
    public static boolean isPrime(Integer num) {
        // System.out.printf("checking if %s is a prime number %n", num);

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Primes in Range %n===================== %nEnter Start of Range (Smaller Positive Integer):");
        int int1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter End of Range (Larger Positive Integer):");
        int int2 = Integer.parseInt(scanner.nextLine());

        System.out.println("...");
        StringBuilder primeList = new StringBuilder();

        for (int i = int1; i <= int2; i++) {
            // System.out.printf("checking integer %s (within range %s - %s) %n", i, int1, int2);
            boolean isThisPrime = isPrime(i);
            if (isThisPrime) {
                primeList.append(i);
                primeList.append(" ");
            }
        }
        System.out.printf("Prime Numbers in Range (%s-%s): %s", int1, int2, primeList);
    }
}
