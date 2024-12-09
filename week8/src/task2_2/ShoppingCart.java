package task2_2;

import java.util.HashMap;

public class ShoppingCart {
    private final HashMap<String, Double> contents;

    /**
     * Shopping Cart Class holds a HashMap of item names and prices
     */
    public ShoppingCart() {
        this.contents = new HashMap<>();
    }

    /**
     * Add item to Shopping Cart
     * @param name name of the added item
     * @param price price of the added item
     * @return true if successful, false if item is already on the list
     */
    public boolean addItem(String name, double price){
        if (this.contents.containsKey(name)) {
            return false;
        } else {
            this.contents.put(name, price);
            return true;
        }
    }

    /**
     * Remove Item from Shopping Cart
     * @param name name or item to be removed
     * @return true if successful, false if name doesn't exist in Cart
     */
    public boolean removeItem(String name){
        if (this.contents.containsKey(name)) {
            this.contents.remove(name);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calculate total cost of Cart currently
     * @return price of all the items in the Cart
     */
    public double calculateTotal(){
        double total = 0;

        for (double price : this.contents.values()) {
            total += price;
        }

        return total;
    }

    /**
     * Check price of item in Shopping Cart
     * @param name name of item to check the price of
     * @return price of item
     * @throws IllegalArgumentException in case of given item not being on the list
     */
    public double checkPrice(String name){
        if (contains(name)){
            return this.contents.get(name);
        } else {
            throw new IllegalArgumentException("can't check price: " + name + " isn't on the list");
        }
    }

    /**
     * Get amount of items in Shopping Cart
     * @return amount of items in Shopping Cart
     */
    public int getItemCount(){
        return this.contents.size();
    }

    /**
     * Check if Cart contains given item
     * @param name name of the item to check
     * @return true if given item is in the cart, false if isn't
     */
    public boolean contains(String name){
        return this.contents.containsKey(name);
    }
}
