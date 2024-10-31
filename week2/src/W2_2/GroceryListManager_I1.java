package W2_2;

import java.util.ArrayList;

/* HOX!
* this is the FIRST (1) iteration of the GroceryListManager
* that fulfills the requirements for task 1
*
* to avoid duplicated code, this class will be modified in the same file
* and the different iterations are simply stored in their
* respective commits in github. the versioned links are stored not only
* in OMA, but also the attached iterations.md file
*
* thanks */

public class GroceryListManager_I1 {
    private static final ArrayList<String> groceryList = new ArrayList<>();

    public static boolean checkItem(String item) {
        /* if (groceryList.contains(item)) { System.out.printf("%s is in Grocery List%n", item);
        } else { System.out.printf("%s is not in Grocery List%n", item); } */
        return groceryList.contains(item);

    }

    public static void addItem(String item) {
        System.out.printf("%nAdding \"%s\" to Grocery List...%n...%n", item);
        if (checkItem(item)) {
            System.out.printf("❌ \"%s\" is already on your grocery list!%n", item);
        } else {
            groceryList.add(item);
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

    public static void displayList() {
        int i = 0;
        System.out.printf("%n================%n");
        System.out.printf("Grocery List 📄%n");
        System.out.printf("================%n");
        if (!groceryList.isEmpty()) {
            for (String item : groceryList) {
                i++;
                System.out.printf("%s. %s%n", i, item);
            }
        } else {
            System.out.printf("(empty)%n");
        }
        System.out.printf("================%n");
    }

    public static void main(String[] args) {
        displayList();

        addItem("Cheese");
        addItem("Cheese");
        addItem("Bacon");
        removeItem("Cheese");
        addItem("Cheese");
        addItem("Bread");
        addItem("Bread");
        addItem("Butter");
        addItem("Lettuce");

        displayList();

        removeItem("Butter");
        removeItem("Bread");
        removeItem("Lettuce");
        removeItem("Cheese");
        removeItem("Cheese");

        displayList();
    }
}