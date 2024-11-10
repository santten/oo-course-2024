package W3_2_T2;

public class Motorcycle extends AbstractVehicle {
    private final String color;
    private final String type;

    public Motorcycle(String fuel, String color){
        super(fuel);
        this.type = "Motorcycle";
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.printf("Motorcycle Information%n");
        System.out.printf("Type: %s || Color: %s%n", type, color);
    }

    @Override
    public String getVehicleType(){
        return type;
    }
}