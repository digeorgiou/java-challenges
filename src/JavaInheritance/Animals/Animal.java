package JavaInheritance.Animals;

public class Animal {
    private double weight;
    private double height;

    Animal(double w, double h){
        weight = w;
        height = h;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
