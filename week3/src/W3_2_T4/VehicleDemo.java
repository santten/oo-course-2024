package W3_2_T4;

public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus("Diesel", "23.2 l/km", 40);

        ElectricMotorcycle eMotorcycle = new ElectricMotorcycle("Electricity", "2 kWh/km", "Black");
        ElectricCar eCar = new ElectricCar("Electricity", "2.2 kWh/km", "Black");

        Motorcycle motorcycle = new Motorcycle("Gasoline", "0.4 l/km", "Black");
        Car car = new Car("Petrol", "0.5 l/km","Red");

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