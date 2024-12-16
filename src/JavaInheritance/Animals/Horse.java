package JavaInheritance.Animals;

public class Horse extends Animal {
    private String color;
    private double tailLength;

    Horse(double w, double h, String col, double tl){
        super(w,h);
        color = col;
        tailLength = tl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
}
