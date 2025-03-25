package LinkedLists.Ex04;

import java.util.Random;

/**
 * Μία τράπεζα αποτελείται από:
 * • N ταμεία (πίνακας από ουρές)
 * και τις ενέργειες:
 * • customerΕnters(fullΝame): Αναθέτει τον πελάτη σε
 * ένα από τα N ταμεία στην τύχη
 * • customerServed(): Ελέγχει ποια ταμεία έχουν πελάτη
 * και εξυπηρετεί κάποιον στην τύχη. Ο πελάτης
 * αφαιρείται από την αντίστοιχη ουρά.
 * • Μετατροπή σε String: Εκτυπώνει τα ταμεία και τους
 * πελάτες που είναι στην ουρά.
 * Στο κυρίως πρόγραμμα η τράπεζα έχει 3 ταμεία:
 * Συνολικά 100 φορές:
 * • Καταφθάνει πελάτης (70% πιθανότητα)
 * • Εξυπηρετείται πελάτης (30% πιθανότητα)
 * Ανά 10 φορές να εκτυπωθεί και η τρέχουσα κατάσταση
 * στα ταμεία.
 */

public class Main {

    public static void main(String[] args) {

        Bank alpha = new Bank(3);

        for(int i = 0 ; i < 100 ; i++){
            Random r = new Random();
            int chance = r.nextInt(100);

            if(chance >= 70){
                alpha.customerServed();
            }
            else {
                alpha.customerEnters("customer " + chance);
            }
            if (i > 0 && (i%10 == 0)){
                System.out.println("After " + i + " times: ");
                System.out.println(alpha);
            }
        }

        System.out.println(alpha);

    }
}
