package W3_2_T4;

public class ElectricCar extends AbstractVehicle {
    private final String color;

    public ElectricCar(String fuel, String fuelEfficiency, String color){
        super(fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.printf("[INFORMATION] Type: %s || Fuel: %s || Fuel Efficiency: %s || Color: %s%n", getVehicleType(), getFuelType(), getFuelEfficiency(), color);
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging.");
    }

    @Override
    public String getVehicleType(){
        return "Electric Car";
    }
}