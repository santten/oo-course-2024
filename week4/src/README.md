### Calculator

This Calculator class holds "a current value" and can sum more integers to that value.

```java
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
```


- **Fields:**
    - `curValue`: An integer that stores the current sum of the numbers entered by the user.

- **Constructor:**
    - `Calculator()`: Initializes `curValue` to 0.

- **Methods:**
    - `getCurValue()`: Returns the current value of the calculator.
    - `setCurValue(int curValue)`: Sets the current value of the calculator.
    - `reset()`: Resets the current value to 0.
    - `sum(int num)`: Adds the provided number to the current value.

- **Main Method**
  - This method continuously prompts the user to enter integers and adds them to the current sum until the user decides to stop by entering 'N' or 'n'. (or in reality, until the user enters something other than 'y' or 'Y') The final sum is then displayed.