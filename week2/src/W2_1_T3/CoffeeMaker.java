package W2_1_T3;

public class CoffeeMaker {
    // -------------------
    // constructor and class variables
    // -------------------

    private boolean currentState;
    private String coffeeType;
    private int coffeeAmount;

    private final int minCoffeeAmount;
    private final int maxCoffeeAmount;

    public CoffeeMaker() {
        currentState = false;
        coffeeType = "normal";
        minCoffeeAmount = 10;
        maxCoffeeAmount = 80;
        coffeeAmount = minCoffeeAmount;
    }

    // -------------------
    // get methods
    // -------------------

    public boolean isOn() {
        return currentState;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    // -------------------
    // set methods
    // -------------------

    public void toggleOnOff() {
        currentState = !currentState;
    }

    public void setCoffeeType(String type) {
        coffeeType = type;
    }

    public void setCoffeeAmount(int amt) {
        if (amt > maxCoffeeAmount) coffeeAmount = maxCoffeeAmount;
        else coffeeAmount = Math.max(amt, minCoffeeAmount);
    }
}
