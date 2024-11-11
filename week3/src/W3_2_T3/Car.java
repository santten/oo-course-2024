package W3_2_T3;

public class Car extends AbstractVehicle {
    private final String color;
    private final String type;

    public Car(String fuel, String color){
        super(fuel);
        this.type = "Car";
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.printf("[INFORMATION] Type: %s || Fuel: %s || Color: %s%n", type, getFuelType(), color);
    }

    @Override
    public String getVehicleType(){
        return type;
    }
}