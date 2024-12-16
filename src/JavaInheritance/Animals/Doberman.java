package JavaInheritance.Animals;

public class Doberman extends Dog{

    Doberman(double w, double h, double bv){
        super(w,h,bv);
    }

    public void run() {
        System.out.println("The doberman is running...");
        System.out.println("Very fast...");
    }
}
