package W2_1_T4;

public class Car {
    // ============================
    // class vars and constructor
    // ============================

    private double speed;
    private double gasolineLevel;
    private final String typeName;

    private final int maxSpeed;
    private final int gasolineCapacity;

    private final int minCruiseControlSpeed;
    private boolean cruiseControlState;
    private int targetSpeed;

    public Car(String typeName) {
        speed = 0;
        maxSpeed = 200;

        minCruiseControlSpeed = 40;
        cruiseControlState = false;

        gasolineLevel = 0;
        gasolineCapacity = 100;
        this.typeName = typeName;
    }


    // ============================
    // regular speed control
    // ============================

    public void accelerate(double amount) {
        if (gasolineLevel > 0) {
            if (speed <= (maxSpeed - amount)) {
                speed += amount;
                gasolineLevel -= 1;
            }
        } else {
            System.out.println("Out of gas!");
            speed = 0;
            System.out.println("Filling tank");
            fillTank();
        }
        System.out.printf("Accelerating: %s Current Speed: %s%n", typeName, speed);
    }

    void decelerate(double amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
            gasolineLevel -= 1;
        } else {
            System.out.println("Out of gas!");
            speed = 0;
            System.out.println("Filling tank");
            fillTank();
        }
        System.out.printf("Decelerating: %s Current Speed: %s%n", typeName, speed);
    }


    // ============================
    // get methods
    // ============================

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }

    void fillTank() {
        gasolineLevel = gasolineCapacity;
    }

    // ============================
    // cruise control
    // ============================

    void setCruiseControlSpeed(int amount) {
        if (amount > maxSpeed) {
            targetSpeed = maxSpeed;
        } else targetSpeed = Math.max(amount, minCruiseControlSpeed);
    }

    void adjustToTargetSpeed() {
        while ((speed < targetSpeed) && cruiseControlState) {
            accelerate(5);
        }
        while ((speed > targetSpeed) && cruiseControlState) {
            decelerate(5);
        }
    }

    boolean isCruiseControlOn() { return cruiseControlState;}
    int getCruiseControlTargetSpeed() { return targetSpeed;}

    void toggleCruiseControl() {
        cruiseControlState = !cruiseControlState;
    }
}