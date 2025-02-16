package JavaInheritance.Food;

import javax.naming.directory.SchemaViolationException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Food[] dinner = new Food[5];

        Scanner sc = new Scanner(System.in);

        TropicalFruit t = new TropicalFruit();
        t.read(sc);


        dinner[0] = new Snack("sn1", 150);
        dinner[1] = new Snack("sn2", 150);
        dinner[2] = new TropicalFruit("fru1", 300, "type1");
        dinner[3] = new TropicalFruit("fru2", 400, "type2");
        dinner[4] = new Snack("sn3", 500);

        double sum = 0.0;
        for(var x : dinner){
            sum += x.eat();
        }

        System.out.println("Total calories: " + sum);
        System.out.println("======================");

        //το ir ειναι αναφορα διεπαφης. Μπορει να αναφερεται σε αντικειμενο
        //οποιασδηποτε κλασης εχει υλοποιησει αυτην την διεπαφη.
        StandardMethods ir = dinner[2];
        //μπορει να καλει μονο μεθοδους της συγκεκριμενης διεπαφης

        ir = dinner[4];
        ir.print();

        DoubleAdjustments d = dinner[4];
        d.doubleEverything();
        dinner[4].print();


        dinner[1].setName("sn1");

        //συγκρινει τις αναφορες, αρα επιστρεφει false, γιατι ειναι
        // διαφορετικες οι αναφορες.
        System.out.println(dinner[0]==dinner[1]);

        System.out.println(dinner[0].equals(dinner[1]));

        Object o;
        o = dinner[1]; // ακομα κι αν η προσβαση στο αντικειμενο ειναι απο
        // υπερκλαση, η equals δουλευει κανονικα
        System.out.println(dinner[0].equals(dinner[1]));
    }



}
