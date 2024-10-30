package W2_1_T2;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        System.out.printf("%n%s Current Gasoline Level: %s", myCar.getTypeName(), myCar.getGasolineLevel());
        myCar.fillTank();
        System.out.printf("%nFilling tank... %n%s Current Gasoline Level: %s%n", myCar.getTypeName(), myCar.getGasolineLevel());

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}