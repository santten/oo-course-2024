package W3_2_T1;

public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus("Diesel", 40);
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Car car = new Car("Petrol", "Red");

        bus.start();
        bus.stop();

        System.out.println();
        motorcycle.start();
        motorcycle.stop();

        System.out.println();
        car.start();
        car.stop();

        System.out.println();
        bus.getInfo();

        System.out.println();
        motorcycle.getInfo();

        System.out.println();
        car.getInfo();
    }
}