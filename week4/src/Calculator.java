import java.util.Scanner;

public class Calculator {
    private int curValue;

    public Calculator() {
        this.curValue = 0;
    }

    public int getCurValue() {
        return curValue;
    }

    public void setCurValue(int curValue) {
        this.curValue = curValue;
    }

    public void reset() {
        setCurValue(0);
    }

    public void sum(int num) {
        // adds passed num value to the current value of calculator
        this.curValue += num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userInput;

        do {
            System.out.print("Enter Your Integer: ");
            int num = scanner.nextInt();
            calculator.sum(num);
            System.out.println("CURRENT NUMBER: " + calculator.getCurValue());

            System.out.print("Add Another Number? [Y/N]: ");
            userInput = scanner.next();
        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("FINAL NUMBER: " + calculator.getCurValue());
        scanner.close();
    }
}