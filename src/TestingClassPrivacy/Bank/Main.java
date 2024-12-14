package TestingClassPrivacy.Bank;

/**
 * Οι πληροφορίες ενός τραπεζικού λογαριασμού είναι:
 * • Το ονοματεπώνυμό του κατόχου (συμβολοσειρά)
 * • Τον αριθμό του λογαριασμού (συμβολοσειρά)
 * • Το υπόλοιπο (πραγματικός)
 * • Τα χρόνια που ο λογαριασμός είναι ενεργός (ακέραιος)
 * Κατασκευάστε την κλάση BankAccount:
 * • Να έχει κατασκευαστή που αρχικοποιεί όλα τα παραπάνω
 * στοιχεία.
 * • Επιθυμούμε να είναι δυνατή έπειτα η αλλαγή (από άλλες
 * κλάσεις) του ονοματεπώνυμου, του υπολοίπου και των ετών
 * που είναι ενεργός.
 * • Επιθυμούμε επίσης να είναι δυνατό το διάβασμα όλων των
 * χαρακτηριστικών της κλάσης
 * • Τέλος επιθυμούμε να είναι δυνατή η εκτύπωση του
 * λογαριασμού (μέθοδος print)
 * Στην main:
 * • Ορίστε έναν λογαριασμό
 * • Τυπώστε τα στοιχεία του λογαριασμού
 * • Αλλάξτε το ονοματεπώνυμο
 * • Τυπώστε τα στοιχεία του λογαριασμού
 * • Αλλάξτε τα έτη
 * • Τυπώστε τα στοιχεία του λογαριασμού
 *
 *
 *
 * Τροποποιώντας τη main της άσκησης, κατασκευάστε έναν
 * πίνακα με 5 τραπεζικούς λογαριασμούς και έπειτα εντοπίστε
 * (αλγοριθμικά) αυτόν που έχει το μεγαλύτερο υπόλοιπο και
 * τυπώστε τον.
 */


public class Main {

    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount("Dimitris", "Georgiou", "AB1234",
                250.0, 5 );

        myAcc.printAccount();

        BankAccount[] array = {
                myAcc, new BankAccount("Dimi", "Geo", "AB1235",
                        1250.0, 14 ), new BankAccount("Dimitr", "Geor",
                        "AB12884",
                2850.0, 21 ), new BankAccount("giogio", "Georgiou", "AB3234",
                2590.0, 8 ), new BankAccount("aasga", "Georgiou", "AB1244",
                25660.0, 7 )
        };
        int maxPosition = -1;
        double max = 0;
        for(int i = 0 ; i < array.length ; i++){
            if (array[i].getBalance() > max) {
                max = array[i].getBalance();
                maxPosition = i;
            }
        }
        System.out.println("The account with the biggest balace is this: ");
        array[maxPosition].printAccount();




    }



}
