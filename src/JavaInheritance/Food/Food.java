package JavaInheritance.Food;


abstract class Food implements StandardMethods, DoubleAdjustments{
    private String name;
    private double calories;

    public Food(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public void doubleEverything() {
        calories = calories * 2;
    }

    @Override
    public void halfEverything() {
        calories = calories / 2;
    }

    abstract double eat() ;
}

