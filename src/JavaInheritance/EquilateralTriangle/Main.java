package JavaInheritance.EquilateralTriangle;

/**
 * Ορίζουμε την εξής ιεραρχία κλάσεων:
 * • Το σχήμα (Shape) έχει την αφηρημένη μέθοδο draw (χωρίς
 * παραμέτρους) και την αφηρημένη μέθοδο moveTo (παίρνει
 * ως παράμετρο ένα σημείο)
 * • Το τρίγωνο (Triangle), κληρονομεί το σχήμα και ορίζεται από
 * τρία σημεία. Ορίζει την draw (απλά να τυπώνει τις
 * συντεταγμένες των σημείων). Ορίζει την moveTo(Point)
 * (αντιστοιχεί στην μετακίνηση του 1ου σημείου στο σημείο-
 * όρισμα – τα υπόλοιπα σημεία να μεταφέρονται σε αντίστοιχη
 * απόσταση). Ορίζει επίσης την τελική μέθοδο perimeter() που
 * υπολογίζει την περίμετρο του τριγώνου.
 * • Οριστε επίσης τη μέθοδο
 * checkEquilateral που ελέγχει αν το τρίγωνο είναι όντως
 * ισόπλευρο.
 * • Οι μέθοδοι sqrt, pow και abs ανήκουν στο java.lang.Math
 * • Λέμε ότι δύο μήκη είναι ίσα, αν η απόλυτη διαφορά τους είναι
 * μικρότερη από έναν πολύ μικρό αριθμό,π.χ. 0.001
 */

public class Main {
    public static void main(String[] args) {

    Triangle tr = new Triangle(new Point(0,0), new Point(1,0), new Point(0,2));

    tr.draw();
        System.out.println("is tr equilateral? " + tr.isEquilateral());

    System.out.println("Perimeter of tr : " + tr.perimeter());


    Triangle tr2 = new Triangle(new Point(0,0), new Point(1,Math.sqrt(3)),
            new Point(2, 0));

    tr2.draw();
        System.out.println("is tr2 equilateral? " + tr2.isEquilateral());
        System.out.println("Perimeter of tr2: " + tr2.perimeter());

    }


}
