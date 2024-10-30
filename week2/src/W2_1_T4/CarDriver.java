package W2_1_T4;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        System.out.printf("%n%s Current Gasoline Level: %s", myCar.getTypeName(), myCar.getGasolineLevel());
        myCar.fillTank();
        System.out.printf("%nFilling tank... %n%s Current Gasoline Level: %s%n", myCar.getTypeName(), myCar.getGasolineLevel());

        myCar.setCruiseControlSpeed(110);
        myCar.toggleCruiseControl();
        System.out.println(myCar.isCruiseControlOn() ? "Cruise Control Turned ON" : "Cruise Control Turned OFF");
        System.out.printf("Current Cruise Control Target Speed %s%n", myCar.getCruiseControlTargetSpeed());
        myCar.adjustToTargetSpeed();

        myCar.setCruiseControlSpeed(80);
        System.out.printf("Current Cruise Control Target Speed %s%n", myCar.getCruiseControlTargetSpeed());
        myCar.adjustToTargetSpeed();

        myCar.toggleCruiseControl();
        System.out.println(myCar.isCruiseControlOn() ? "Cruise Control Turned ON" : "Cruise Control Turned OFF");

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
        }
    }
}