package JavaInheritance.AbstractClassAndMethods;

/**
 * Κατασκευάστε μία κλάση με όνομα Scripts:
 * • Περιέχει τη μέθοδο makeDoubleSound: Παίρνει ως όρισμα ένα
 * ζώο και τυπώνει δύο φορές τον ήχο που αυτό βγάζει.
 * Κατασκευάστε έπειτα ένα πρόγραμμα που χρησιμοποιεί τη
 * μέθοδο που μόλις ορίσαμε (πειραματιστείτε και ελέγξτε ότι
 * δουλεύει σωστά για διαφορετικά ζώα).
 */

public class Scripts {

    //μπορει να παρει ορισμα και απο κλασεις που κανουν extend την Animal
    //αφου η Animal ειναι abstract αρα δεν μπορει να εχει αντικειμενα
    void makeDoubleSound(Animal a){
        a.makeSound();
        a.makeSound();
    }
}
