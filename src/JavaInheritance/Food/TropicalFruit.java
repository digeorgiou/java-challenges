package JavaInheritance.Food;


public class TropicalFruit extends Food{
    private String type;

    public TropicalFruit(String name, double calories, String type) {
        super(name, calories);
        this.type = type;
    }

    @Override
    public double eat(){
        System.out.printf("I am eating %s(%s)",super.getName(),this.type);
        System.out.println();
        return super.getCalories();
    }

    @Override
    public Object copy() {
        return new TropicalFruit(this.getName(), this.getCalories(), this.type);
    }

    @Override
    public String toString() {
        return "TropicalFruit: " +
                "type= '" + type + '\'' + super.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    //βαζουμε σαν ορισμα το Object για να μπορω να βαλω σαν ορισμα,
    // οποιαδηποτε υπερκλαση του TropicalFruit. πχ Food
    //(γινεται αυτοματα cast σε Object
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        //γινεται το input , cast σε TropicalFruit
        TropicalFruit that = (TropicalFruit) obj;
        return getName().equals(that.getName())
                && getCalories() == that.getCalories()
                && type.equals(that.type);
    }
}
