package W3_2_T4;

public class Motorcycle extends AbstractVehicle {
    private final String color;
    private final String type;

    public Motorcycle(String fuel, String fuelEfficiency, String color){
        super(fuel, fuelEfficiency);
        this.type = "Motorcycle";
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