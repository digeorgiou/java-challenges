package JavaInheritance.Animals;

public class Bulldog extends Dog{
    double earSize;

    Bulldog(double w, double h, double bv, double es){
        super(w,h,bv);
        earSize = es;
    }

    public void sleep() {
        System.out.println("The bulldog is sleeping...");
        System.out.println("ZzzzZZzzzz");
    }

    public double getEarSize() {
        return earSize;
    }

    public void setEarSize(double earSize) {
        this.earSize = earSize;
    }
}
