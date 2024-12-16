package JavaInheritance.Animals;

import java.sql.SQLOutput;

/**
 * Ορίζουμε μια οντολογία του ζωϊκού βασιλείου:
 * • Ζώο: Έχει χαρακτηριστικά βάρος και ύψος
 * • Άλογο: Κληρονομεί το Ζώο και το επεκτείνει με:
 * • το χρώμα του
 * • την ούρά του (μήκος)
 * • Σκύλος: Κληρονομεί το Ζώο και το επεκτείνει με:
 * • την ένταση γαβγίσματος (σε dB)
 * • τη μέθοδο bark() που βγάζει έναν κατάλληλο ήχο
 * • Doberman: Κληρονομεί το Σκύλο και το επεκτείνει με:
 * • τη μέθοδο run() που βγάζει κατάλληλο μήνυμα
 * • Bulldog: Κληρονομεί το Σκύλο και το επεκτείνει με:
 * • το μέγεθος των αυτιών του
 * • τη μέθοδο sleep() που βγάζει κατάλληλο μήνυμα
 * Έπειτα ορίστε ένα συγκεκριμένο άλογο, ένα Doberman και ένα
 * bulldog:
 * • Τυπώστε το χρώμα του αλόγου
 * • Το Doberman γαβγίζει, τρέχει και μετά γαβγίζει
 * • Το Bulldog γαβγίζει, κοιμάται και μετα κοιμάται ξανα.
 *
 * οι κλασεις Bulldog και Doberman εχουν σχεση is-a με την κλαση dog
 */

public class Main {

    public static void main(String[] args) {

        Horse dollie = new Horse(120.0, 180, "white", 1.0 );
        Doberman dobbie = new Doberman(40.0 , 120.0, 6.5);
        Bulldog max = new Bulldog(50.0 , 90.2, 4.3 , 0.4);

        System.out.println(dollie.getColor());

        dobbie.bark();
        dobbie.run();
        dobbie.bark();


        max.bark();
        max.sleep();
        max.sleep();

    }
}
