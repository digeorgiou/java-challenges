package TestingStaticKeyword.Circle;

public class Circle {

    private double c;
    //I make PI static because it's the same for every object
    static final double PI = 3.1415;
    private String metric;

    Circle(int c, String metric) {
        this.c = c;
        this.metric = metric;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //I make these methods static because they are the same for all the
    // objects in the class
    public static double inToCm(double inches){
        return 2.54 * inches;
    }

    public static double cmToIn(double cm){
        return cm/2.54;
    }

    // cant make these methods static because they use some variables from
    // the object.
    public double perimeterCm() {
        if (this.metric.equals("cm"))
            return 2 * PI * c;
        else
            return 2 * PI * inToCm(c);
    }

    public double perimeterIn() {
        if (this.metric.equals("in"))
            return 2 * PI * c;
        else
            return 2 * PI * cmToIn(c);
    }

}
