package TestingClassPrivacy.Building;


/**
 * • Κατασκευάστε μία κλάση με όνομα Flat, με μέλος πόσα άτομα
 * περιέχει (people). Να αρχικοποιείται σε 0.
 * • μια κλαση Storey: Να περιέχει ως μέλος έναν πίνακα με
 * διαμερίσματα. O constructor να αρχικοποιεί τον πίνακα με
 * cFlats διαμερίσματα σε κάθε όροφο (cFlats, δηλαδή να είναι
 * παράμετρος).
 * μια κλαση Building: O constructor να δέχεται ως έξτρα
 * παράμετρο και το πλήθος των διαμερισμάτων σε κάθε όροφο
 * Δημιουργειστε τις μεθόδους όλων των κλάσεων
 * ώστε το πλήθος των ατόμων να αποθηκεύονται στο διαμέρισμα
 *
 * τo storey με το building εχουν την σχεση has-a γιατι το κτηριο περιεχει
 * οροφους
 */


public class Main {

    public static void main(String[] args) {

        Building bl = new Building(5, 6);

        bl.randomizePeople();

        bl.printPeople();




    }
}
