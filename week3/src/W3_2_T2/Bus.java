package W3_2_T2;

import W3_2_T1.Vehicle;

public class Bus implements Vehicle {
    private final String fuel;
    private final int capacity;
    private final String type;

    public Bus(String fuel, int capacity){
        this.type = "Bus";
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.printf("Bus Information%n");
        System.out.printf("Type: %s || Fuel: %s || Capacity: %s passengers%n", type, fuel, capacity);
    }
}