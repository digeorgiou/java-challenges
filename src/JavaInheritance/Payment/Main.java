package JavaInheritance.Payment;

/**
 * Η κλάση Payment έχει μέλη:
 * • Ποσό (πραγματικός)
 * • Δημόσια μέθοδος: print() – τυπώνει τα στοιχεία της πληρωμής
 * Η κλάση Payment κληρονομείται από την Credit η οποία έχει μέλη:
 * • number (αριθμός κάρτας - συμβολοσειρά)
 * • expDate (ημ/νία λήξης κάρτας - συμβολοσειρά)
 * • Επαναορίζει την print()
 * Η κλάση Payment κληρονομείται από την Check η οποία έχει μέλη:
 * • number (αριθμός check_book - ακέραιος)
 * • bankCode (συμβολοσειρά)
 * • Επαναορίζει την print()
 * Στο κυρίως πρόγραμμα:
 * • Ορίστε 3 αντικείμενα πληρωμών.
 * • Εκτυπώστε τα στοιχεία τους.
 * Προσοχή! Στις κλάσεις να ορίσετε constructors και μόνο τους
 * απαραίτητους getters ώστε να γίνουν σωστά οι εκτυπώσεις.
 */

public class Main {
    public static void main(String[] args) {

    Payment p  = new Payment(1.2);
    p.print();

    Credit c = new Credit(2.5 , "1251513513", "31-12-2025");
    c.print();

    Check ch = new Check(1.6, "252525212", 123412);
    ch.print();

    }
}
