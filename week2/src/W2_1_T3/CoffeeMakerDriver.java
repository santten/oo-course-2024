package W2_1_T3;

public class CoffeeMakerDriver {
    public static int getRandom(int max) {
        return (int) (Math.random() * max + 1);
    }

    public static void main(String[] args) {
        CoffeeMaker cm = new CoffeeMaker();

        // turning coffeemaker on
        cm.toggleOnOff();
        System.out.println("Coffee Maker is ON");

        // randomly brew coffee 10 times
        for (int i = 0; i < 10; i++) {
            int typeRandomizer = getRandom(2);
            cm.setCoffeeType(typeRandomizer < 2 ? "normal" : "espresso");
            cm.setCoffeeAmount(getRandom(8) * 10);

            // before round 8 the coffee maker is turned off to demonstrate that the settings are retained
            // through toggling the machine on and off

            if (i == 7){
                cm.toggleOnOff();
                System.out.printf("Coffee Maker is OFF || Current Settings: %s ml of %s coffee%n", cm.getCoffeeAmount(), cm.getCoffeeType());
                cm.toggleOnOff();
                System.out.println("Coffee Maker is ON");
            }

            if (cm.isOn()) {
                System.out.printf("Brewing %s ml of %s coffee...%n", cm.getCoffeeAmount(), cm.getCoffeeType());
            }
        }

        cm.toggleOnOff();
        System.out.println("Coffee Maker is OFF");
    }
}
