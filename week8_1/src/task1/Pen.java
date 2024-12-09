package task1;

public class Pen {
    private Color color;
    private boolean cap;

    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }

    public Pen(){
        this.cap = true;
        this.color = Color.RED;
    }

    public Pen(Color color){
        this.cap = true;
        this.color = color;
    }

    public void capOff(){
        this.cap = false;
    }

    public void capOn(){
        this.cap = true;
    }

    public void changeColor(Color color){
        this.color = color;
    }

    public String draw(){
        if (this.cap) { return ""; }
        else {
            return "Drawing " + this.color.toString();
        }
    }
}