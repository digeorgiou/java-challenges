package TestingStaticKeyword.Circle;

/**
 * Ένας κύκλος με κέντρο την αρχή των αξόνων περιγράφεται από την εξίσωση:
 * x^2 + y^2 = c^2
 * Ορίστε την κλάση Cycle στην οποία να
 *  ορίζονται:
 * • Constructor: να αρχικοποιεί το c (πραγματικός), metric (συμβολοσειρά «in» ή «cm»)
 * • Getter/Setter: Για το c
 * • PI: σταθερά double ίση με 3.1415
 * • inToCm: Μετατρέπει τις ίντσες (όρισμα) σε εκατοστά. 1in = 2,54cm)
 * • CmToIn: Μετατρέπει τα εκατοστά (όρισμα) σε ίντσες.
 * • perimeterCm(): Να υπολογίζει και να επιστρέφει την περίμετρο του κύκλου σε εκατοστά (2πc)
 * • perimeterIn(): Να υπολογίζει και να επιστρέφει την περίμετρο του κύκλου σε ίντσες (2πc)
 * Σκεφθείτε ποια από τα παραπάνω μέλη μπορούν να είναι στατικά και έπειτα κατασκευάστε main για τον έλεγχο της παραπάνω
 * συμπεριφοράς.
 */

public class Main {

    public static void main(String[] args) {

    Circle c = new Circle(1, "in");
        System.out.println("Perimeter-cm: " + c.perimeterCm());
        System.out.println("Perimeter-in: " + c.perimeterIn());

        // can't use c.inToCm because inToCm is static method and
        // doesn't apply in specific object.
    }
}
