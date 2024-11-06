package W3_1_T2;

public class Bus extends Car {
    int passengers;

    public Bus(String typeName) {
        super(typeName);
        this.passengers = 0;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int amount) {
        this.passengers = amount;
    }

    public void passengersEnter(int amount) {
        setPassengers(getPassengers() + amount);
    }

    public void passengersExit(int amount) {
        setPassengers(getPassengers() - amount);
    }
}
