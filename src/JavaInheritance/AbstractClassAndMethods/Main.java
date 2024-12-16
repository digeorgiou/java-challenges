package JavaInheritance.AbstractClassAndMethods;

/**
 * Ορίζουμε την εξής ιεραρχία κλάσεων:
 * • Το ζώο (Animal) έχει την αφηρημένη μέθοδο makeSound
 * (χωρίς παραμέτρους)
 * • Η γάτα (Cat), κληρονομεί το ζώο, και επαναορίζει τη μέθοδο
 * makeSound που τυπώνει “Meow”
 * • Η γάτα Ιμαλαϊών (HimalayanCat), κληρονομεί τη γάτα,
 * επαναορίζει τη μέθοδο makeSound που τυπώνει “Miouw
 * Miouw”
 * • Ο σκύλος (Dog), κληρονομεί το ζώο και επαναορίζει τη μέθοδο
 * makeSound που τυπώνει “Woof Woof”
 * • Το Doberman που κληρονομεί το σκύλο και δεν επαναορίζει
 * τη μέθοδο makeSound
 * • To KingDoberman που κληρονομεί το Doberman και
 * επαναορίζει τη μέθοδο makeSound που τυπώνει
 * “WOOAAAAAAAAF”
 * Ορίστε έπειτα ένα αντικείμενο από κάθε κλάση και εκτυπώστε τον
 * ήχο που αυτό κάνει (διαπιστώστε και ότι δεν μπορεί να οριστεί
 * αντικείμενο της αφηρημένης κλάσης).
 */


public class Main {
    public static void main(String[] args) {

    // I can't make an object of the class Animal
    // because class Animal is abstract.
    Cat c = new Cat() ;
    HimalayanCat hc = new HimalayanCat();
    Dog d = new Dog();
    Doberman dob = new Doberman();
    KingDoberman kd = new KingDoberman();

    c.makeSound();
    hc.makeSound();
    d.makeSound();
    dob.makeSound();
    kd.makeSound();

    }






}
