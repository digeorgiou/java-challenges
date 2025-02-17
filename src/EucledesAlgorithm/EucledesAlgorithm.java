package EucledesAlgorithm;

/**
 * O αλγόριθμος του Ευκλείδη για την εύρεση του Μέγιστου Κοινού Διαιρέτη δύο (φυσικών)
 * αριθμών:
 * Ξεκινά με ένα ζεύγος φυσικών και σχηματίζει ένα νέο ζευγάρι με τον μικρότερο αριθμό και
 * την διαφορά του μικρότερου από τον μεγαλύτερο αριθμό.
 *  Η διαδικασία επαναλαμβάνεται εωσότου οι αριθμοί γίνουν ίσοι. Ο αριθμός αυτός είναι ο
 * ΜΚΔ των αρχικών αριθμών.
 * Κατασκευάστε έναν αλγόριθμο που θα υλοποιεί με μία αναδρομική συνάρτηση τον υπολογισμό
 * του ΜΚΔ και θα ζητάει από το χρήστη να εισάγει τους δύο φυσικούς, θα κάνει κατάλληλη κλήση
 * της συνάρτησης και θα τυπώνει τον ΜΚΔ των αριθμών.
 */

public class EucledesAlgorithm {
    public static void main(String[] args) {

        System.out.println(mkd(25, 5));
        System.out.println(mkd(6, 27 ));
        System.out.println(mkd(109, 24));

    }

    static int mkd(int a, int b){
        if( a == b) return a;
        if( a > b){
            return mkd(b , a-b);
        }else return mkd(a, b-a);
    }
}
