package JavaExceptions.Bank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Αναπτύξτε μία μέθοδο void printMenu() που εμφανίζει ένα
 * μενού με επιλογές από 1 έως 4 (και 5 για Exit).
 * • Καθώς και μία μέθοδο int getChoice() για να διαβάσετε το
 * choice του χρήστη με Scanner
 * • Στη μέθοδο int getChoice() αν ο χρήστης δώσει μη-ακέραιο
 * ελέγξτε κατάλληλα με state-testing (hasNextInt())
 * • Επίσης, αν η επιλογή δεν είναι μεταξύ 1-5 τότε δημιουργεί
 * (throws) ένα IllegalArgumentException, το οποίο παρότι είναι
 * RunTimeException, θα μπορούσαμε στη συγκεκριμένη
 * περίπτωση να κάνουμε try/catch και rethrow.
 * • Διαμορφώστε τη main() κατάλληλα ώστε να κάνει try / catch
 * το exception και να επικοινωνεί με τον χρήστη με κατάλληλο
 * μήνυμα
 */


public class MenuApp {

    public static void main(String[] args) {
        int choice;
        while (true) {
            try {
                printMenu();
                choice = getChoice();
                if (choice == 5) break;
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }
        System.out.println("Goodbye");
    }

    static void printMenu(){
        System.out.println("-----Bank Menu------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Pay bills");
        System.out.println("5. Exit");
        System.out.println("Please choose : ");
    }

    static int getChoice() throws IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.println("Choice must be an Integer");
            sc.nextLine();
        }
        int choice = sc.nextInt();
        try {
            if (choice < 1 || choice > 5) {
                throw new IllegalArgumentException("Choice must be between 1 and 5");
            }
            return choice;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }

    }

    public static void printChoice(int choice)  {
        System.out.println("Choice: " + choice);
    }

    public static void log(Exception e) {
        Path path = Paths.get("C:/tmp/log.txt");    // Create a path with nio

        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) { // true is for append
            ps.println(LocalDateTime.now() + "\n" + e.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
