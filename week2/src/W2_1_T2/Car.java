package W2_1_T2;

public class Car {
    private double speed;
    private double gasolineLevel;
    private final String typeName;

    private final int maxSpeed;
    private final int gasolineCapacity;

    public Car(String typeName) {
        speed = 0;
        maxSpeed = 200;

        gasolineLevel = 0;
        gasolineCapacity = 200;
        this.typeName = typeName;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            if (speed <= (maxSpeed - 10)) {
                speed += 10;
            }
        } else {
            speed = 0;
        }
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = gasolineCapacity;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}