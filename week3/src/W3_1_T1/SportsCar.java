package W3_1_T1;

public class SportsCar extends Car {
    private final int maxSpeed;
    private final int gasolineCapacity;
    private final int speedStep;

    public SportsCar(String typeName) {
        super(typeName);
        this.maxSpeed = 300;
        this.gasolineCapacity = 400;
        this.speedStep = 20;
    }

    @Override
    public void fillTank() {
        setGasolineLevel(this.gasolineCapacity);
    }

    @Override
    int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    int getSpeedStep() {
        return this.speedStep;
    }
}