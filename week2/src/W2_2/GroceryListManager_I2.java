package W2_2;

import java.util.HashMap;

/* HOX!
 * this is the SECOND (2) iteration of the GroceryListManager
 * that fulfills the requirements for task 2
 *
 * to avoid duplicated code, this class will be modified in the same file
 * and the different iterations are simply stored in their
 * respective commits in github. the versioned links are stored not only
 * in OMA, but also the attached iterations.md file
 *
 * thanks */

public class GroceryListManager_I2 {
    private static final HashMap<String, Double> groceryList = new HashMap<>();

    public static boolean checkItem(String item) {
        if (groceryList.get(item) != null) {
            System.out.printf("%s is in Grocery List%n", item);
        } else {
            System.out.printf("%s is not in Grocery List%n", item);
        }
        return groceryList.get(item) != null;
    }

    public static void addItem(String item, Double price) {
        System.out.printf("%nAdding \"%s\" to Grocery List...%n...%n", item);
        if (checkItem(item)) {
            System.out.printf("❌ \"%s\" is already on your grocery list!%n", item);
        } else {
            groceryList.put(item, price);
            System.out.printf("✅ \"%s\" added to your grocery list!%n", item);
        }
    }

    public static void removeItem(String item) {
        System.out.printf("%nRemoving \"%s\" from Grocery List...%n...%n", item);
        if (checkItem(item)) {
            groceryList.remove(item);
            System.out.printf("✅ \"%s\" removed from grocery list.%n", item);
        } else {
            System.out.printf("❌ You can't remove an item that isn't on your list.%n");
        }
    }

    public static double calculateTotalCost() {
        double totalcost = 0;
        for (String item : groceryList.keySet()) {
            totalcost += groceryList.get(item);
        }
        return totalcost;
    }

    public static void displayList() {
        int i = 0;
        System.out.printf("%n================%n");
        System.out.printf("Grocery List 📄%n");
        System.out.printf("================%n");
        if (!groceryList.isEmpty()) {
            for (String item : groceryList.keySet()) {
                i++;
                System.out.printf("%s. %s (%s €)%n", i, item, groceryList.get(item));
            }
        } else {
            System.out.printf("(empty)%n");
        }

        if (!groceryList.isEmpty()) {
            System.out.printf("💸 Total Cost of %s Item%s: %.2f €%n", groceryList.size(), groceryList.size() > 1 ? "s" : "", calculateTotalCost());
        }

        System.out.printf("================%n");
    }

    public static void main(String[] args) {
        displayList();

        addItem("Cheese", 12.99);
        addItem("Cheese", 12.99);
        addItem("Bacon", 34.99);
        removeItem("Cheese");
        addItem("Cheese", 43.99);
        addItem("Bread", 43.99);
        addItem("Bread", 12.99);
        addItem("Butter", 43.99);
        addItem("Lettuce", 21.99);

        displayList();

        removeItem("Butter");
        removeItem("Bread");
        removeItem("Lettuce");
        removeItem("Cheese");
        removeItem("Cheese");

        displayList();
    }
}