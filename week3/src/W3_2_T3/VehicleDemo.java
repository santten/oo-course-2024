package W3_2_T3;

public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus("Diesel", 40);

        ElectricMotorcycle eMotorcycle = new ElectricMotorcycle("Electricity", "Black");
        ElectricCar eCar = new ElectricCar("Electricity", "Black");

        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Car car = new Car("Petrol", "Red");

        eMotorcycle.start();
        eMotorcycle.stop();

        eCar.start();
        eCar.stop();

        bus.start();
        bus.stop();

        motorcycle.start();
        motorcycle.stop();

        car.start();
        car.stop();

        System.out.println();
        bus.getInfo();
        motorcycle.getInfo();
        car.getInfo();
        eCar.getInfo();
        eMotorcycle.getInfo();

        System.out.println();
        bus.charge();
        eMotorcycle.charge();
        eCar.charge();
    }
}