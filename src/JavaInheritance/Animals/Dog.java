package JavaInheritance.Animals;

public class Dog extends Animal{
    private double barkVolume;

    Dog(double w, double h, double bv){
        super(w,h);
        barkVolume = bv;
    }

    public void bark() {
        System.out.println("Woof Woof");
        System.out.println("Woof");
    }

    public double getBarkVolume() {
        return barkVolume;
    }

    public void setBarkVolume(double barkVolume) {
        this.barkVolume = barkVolume;
    }
}
