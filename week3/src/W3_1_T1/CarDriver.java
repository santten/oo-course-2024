package W3_1_T1;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Normal Car");
        Car mySportsCar = new SportsCar("Sports Car");

        System.out.printf("%n%s Current Gasoline Level: %s", myCar.getTypeName(), myCar.getGasolineLevel());
        myCar.fillTank();
        System.out.printf("%nFilling tank... %n%s Current Gasoline Level: %s%n%n", myCar.getTypeName(), myCar.getGasolineLevel());

        while (myCar.getSpeed() < myCar.getMaxSpeed()){
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        System.out.printf("%n%s Current Gasoline Level: %s", mySportsCar.getTypeName(), mySportsCar.getGasolineLevel());
        mySportsCar.fillTank();
        System.out.printf("%nFilling tank... %n%s Current Gasoline Level: %s%n%n", mySportsCar.getTypeName(), mySportsCar.getGasolineLevel());

        while (mySportsCar.getSpeed() < mySportsCar.getMaxSpeed()) {
            mySportsCar.accelerate();
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }

        System.out.printf("%n%s Current Gasoline Level: %s", mySportsCar.getTypeName(), mySportsCar.getGasolineLevel());
        mySportsCar.fillTank();
        System.out.printf("%nFilling tank... %n%s Current Gasoline Level: %s%n%n", mySportsCar.getTypeName(), mySportsCar.getGasolineLevel());

        while (mySportsCar.getSpeed() > 0) {
            mySportsCar.decelerate();
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }
    }
}