package W3_2_T3;

public class ElectricCar extends AbstractVehicle {
    private String color;

    public ElectricCar(String fuel, String color){
        super(fuel);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.printf("[INFORMATION] Type: %s || Fuel: %s || Color: %s%n", getVehicleType(), getFuelType(), getColor());
    }

    @Override
    public String getVehicleType(){
        return "Electric Car";
    }
}