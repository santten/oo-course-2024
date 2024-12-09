package task2_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();

        assertTrue(cart.addItem("Apple", 1.0));
        assertTrue(cart.addItem("Banana", 0.5));
        assertFalse(cart.addItem("Banana", 0.5));

        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);

        assertTrue(cart.removeItem("Apple"));
        assertTrue(cart.removeItem("Banana"));
        assertFalse(cart.removeItem("Banana"));
    }

    @Test
    public void testCheckPrice(){
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.0);
        assertEquals(1.0, cart.checkPrice("Apple"), 0.1);
        cart.addItem("Banana", 2.0);
        assertEquals(2.0, cart.checkPrice("Banana"), 0.1);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> cart.checkPrice("Pineapple"));

        String expectedMessage = "can't check price: Pineapple isn't on the list";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testAmountOfItems(){
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 1.0);
        cart.addItem("Apple", 1.0);
        cart.addItem("Orange", 1.0);

        assertEquals(3, cart.getItemCount());
    }

    @Test
    public void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);

        assertEquals(2.25, cart.calculateTotal(), 0.01);
    }

    @Test
    public void multipleMethodTest() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.removeItem("Apple");
        assertFalse(cart.contains("Apple"));

        cart.addItem("Apple", 1.0);
        assertEquals(1.0, cart.checkPrice("Apple"), 0.01);
        cart.addItem("Banana", 2.0);
        cart.addItem("Orange", 1.0);
        assertEquals(4.0, cart.calculateTotal(), 0.01);
        assertEquals(3, cart.getItemCount());
    }
}