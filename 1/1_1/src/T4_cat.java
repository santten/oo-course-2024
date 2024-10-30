public class T4_cat {
    private final String name;

    public T4_cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        T4_cat cat1 = new T4_cat("Whiskers");
        T4_cat cat2 = new T4_cat("Rex");

        // Call the meow method on the cat instance
        cat1.meow();
        cat1.meow();
        cat2.meow();
        cat1.meow();
    }
}