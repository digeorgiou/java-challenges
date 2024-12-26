package JavaInheritance.Food;


public class Snack extends Food{

    public Snack(String name, double calories) {
        super(name,calories);
    }

    @Override
    public double eat(){
        System.out.println("I am eating snack" + super.getName());
        return super.getCalories();
    }


    @Override
    public Object copy() {
        return new Snack(this.getName(), this.getCalories());
    }

    @Override
    public String toString() {
        return "Snack: " + super.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Snack that = (Snack) obj;
        return getName().equals(that.getName()) && getCalories() == that.getCalories();
    }
}
