package W3_2_T3;

public class ElectricMotorcycle extends AbstractVehicle {
    private String color;

    public ElectricMotorcycle(String fuel, String color) {
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
    public String getVehicleType() {
        return "Electric Motorcycle";
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging.");
    }

    @Override
    public void getInfo() {
        System.out.printf("[INFORMATION] Type: %s || Fuel: %s || Color: %s%n", getVehicleType(), getFuelType(), getColor());
    }
}