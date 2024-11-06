package W3_1_T1;

public class Car {
    private double speed;
    private double gasolineLevel;
    private final String typeName;

    private final int maxSpeed;
    private final int gasolineCapacity;
    private final int speedStep;

    public Car(String typeName) {
        this.speed = 0;
        this.maxSpeed = 140;

        this.gasolineLevel = 0;
        this.gasolineCapacity = 200;
        this.typeName = typeName;

        this.speedStep = 10;
    }

    public void accelerate() {
        if (getGasolineLevel() > 0 && getSpeed() < getMaxSpeed()) {
            setGasolineLevel(getGasolineLevel() - 10);
            setSpeed(getSpeed() + getSpeedStep());
        }
    }


    public void decelerate() {
        if (getGasolineLevel() > 0) {
            setGasolineLevel(getGasolineLevel() - 10);
            setSpeed(Math.max(0, getSpeed() - getSpeedStep()));
        } else {
            setSpeed(0);
        }
    }

    double getSpeed() {
        return this.speed;
    }

    int getMaxSpeed() {
        return this.maxSpeed;
    }

    String getTypeName() {
        return this.typeName;
    }

    public void fillTank() {
        this.gasolineLevel = getGasolineCapacity();
    }

    double getGasolineCapacity() {
        return this.gasolineCapacity;
    }


    double getGasolineLevel() {
        return this.gasolineLevel;
    }

    int getSpeedStep() {
        return this.speedStep;
    }

    void setSpeed(double amount) {
        this.speed = amount;
    }

    void setGasolineLevel(double amount) {
        this.gasolineLevel = amount;
    }
}