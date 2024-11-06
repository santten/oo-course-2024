package W3_1_T2;

public class CarDriver {
    public static void main(String[] args) {
        Bus myBus = new Bus("Amazing Bus");
        
        System.out.printf("%n%s Current Gasoline Level: %s", myBus.getTypeName(), myBus.getGasolineLevel());
        myBus.fillTank();
        System.out.printf("%nFilling tank... %n%s Current Gasoline Level: %s%n%n", myBus.getTypeName(), myBus.getGasolineLevel());

        System.out.printf("Passengers entering!%n");
        myBus.passengersEnter(15);
        System.out.printf("Bus has %s passengers%n", myBus.getPassengers());

        System.out.printf("Passengers entering!%n");
        myBus.passengersEnter(7);
        System.out.printf("Bus has %s passengers%n", myBus.getPassengers());

        System.out.printf("%nBus is leaving the stop!%n%n");

        while (myBus.getSpeed() < 120 && myBus.getGasolineLevel() > 0){
            myBus.accelerate();
            System.out.println(myBus.getTypeName() + ": speed is " + myBus.getSpeed() + " km/h" + " gasoline level is" + myBus.getGasolineLevel());
        }

        while (myBus.getSpeed() > 0) {
            myBus.decelerate();
            System.out.println(myBus.getTypeName() + ": speed is " + myBus.getSpeed() + " km/h");
        }

        System.out.printf("%n7 passengers exiting...%n");
        myBus.passengersExit(7);
        System.out.printf("Bus has %s passengers%n", myBus.getPassengers());


        System.out.printf("12 passengers entering...%n");
        myBus.passengersEnter(12);
        System.out.printf("10 passengers exiting...%n");
        myBus.passengersExit(7);
        System.out.printf("Bus has %s passengers%n", myBus.getPassengers());

    }
}