package JavaInheritance.Playlist;

/**
 * Κατασκευάζουμε ένα πρόγραμμα που παρακολουθεί playlists με
 * βίντεο:
 * • Ένα playlist στο youtube αποτελείται από το τίτλο του
 * (συμβολοσειρά) και τα βίντεο από τα οποία αποτελείται
 * (πίνακας με το πολύ 10 συμβολοσειρές)
 * • Και τα δύο αυτά μέλη της κλάσης να είναι δημόσια
 * Για το playlist να υπάρχουν οι δημόσιες μέθοδοι:
 * • Για την προσθήκη νέου βίντεο στο playlist
 * • recommendation() να επιστρέφει τυχαία κάποιο βίντεο
 * • print() για την εκτύπωση των περιεχομένων του.
 * Έπειτα η Playlist να κληρονομείται από την PlaylistTutorial:
 * • Προστίθεται το δημόσιο μέλος “subject” στο οποίο
 * αναπαρίσταται το θέμα του playlist (π.χ. “programming”)
 * • Επαναορίζει τη recommendation ώστε να επιστρέφει το 1ο
 * βίντεο του playlist.
 * Στο κυρίως πρόγραμμα να κατασκευάζεται ένα Playlist (με 5
 * βίντεο), ένα PlaylistTutorial (με 3 βίντεο), να τυπώνονται τα
 * περιεχόμενά τους, και να γίνονται recommendations (ένα από το
 * κάθε playlist)
 */

public class Main {
    public static void main(String[] args) {

        Playlist punk = new Playlist("punk");
        PlaylistTutorial howToMakeCookies = new PlaylistTutorial("cookies",
                "cooking");

        punk.addNewVideo("Video Number 1");
        punk.addNewVideo("Video Number 2");
        punk.addNewVideo("Video Number 3");
        punk.addNewVideo("Video Number 4");
        punk.addNewVideo("Video Number 5");
        howToMakeCookies.addNewVideo("Video 01");
        howToMakeCookies.addNewVideo("Video 02");
        howToMakeCookies.addNewVideo("Video 03");

        punk.print();

        howToMakeCookies.print();

        System.out.println("Punk recommends : " + punk.recommendation());
        System.out.println("Cookies recommend: " + howToMakeCookies.recommendation());

    }
}
