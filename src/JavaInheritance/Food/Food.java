package JavaInheritance.Food;


import java.util.Scanner;

abstract class Food implements StandardMethods, DoubleAdjustments{
    private String name;
    private double calories;


    public Food(){

    }

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

    public void read(Scanner sc) {
        System.out.println("Give food name: ");
        this.name = sc.nextLine();

        while(true){
            System.out.println("Give calories: ");
            if(sc.hasNextDouble()){
                this.calories = sc.nextDouble();
                break;
            }
            else{
                System.out.println("Only doubles please.");
                sc.next();
            }
        }
        sc.nextLine(); //το βαζω γιατι αλλιως μενει ενα /n που δεν το
        // καταναλωνει η nextDouble
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

