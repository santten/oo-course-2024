package W3_2_T4;

public class Car extends AbstractVehicle {
    private final String color;
    private final String type;

    public Car(String fuel, String fuelEfficiency, String color){
        super(fuel, fuelEfficiency);
        this.type = "Car";
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.printf("[INFORMATION] Type: %s || Fuel: %s || Fuel Efficiency: %s || Color: %s%n", getVehicleType(), getFuelType(), getFuelEfficiency(), color);
    }

    @Override
    public String getVehicleType(){
        return type;
    }
}