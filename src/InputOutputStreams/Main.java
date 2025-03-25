package InputOutputStreams;

import java.io.*;
import java.util.Scanner;

/**
 * Κατασκευάζουμε ένα πρόγραμμα διαχείρισης χρηστών. Συγκεκριμένα:
 * • Κάθε χρήστης θα είναι ένα αντικείμενο της κλάσης User με στοιχεία fullName, username, password, role (ακέραιος με τιμές 1(admin) ή
 * 2(user))
 * • Όλοι ο χρήστες θα αποθηκεύονται στο κυρίως πρόγραμμα σε έναν πίνακα (το πρόγραμμα θα υποστηρίζει μέχρι 10 χρήστες).
 * • Αποθηκεύουμε τον πίνακα σε ένα δυαδικό αρχείο (users.bin)
 * Κατασκευάστε ένα πρόγραμμα που να διαχειρίζεται τους χρήστες στο αρχείο. Συγκεκριμένα, να εμφανίζεται ένα μενού με τις εξής
 * ενέργειες:
 * 1. Εισαγωγή χρήστη. Εισάγονται τα στοιχεία του χρήστη και γίνεται η αποθήκευση στον πίνακα. Να μην γίνεται έλεγχος για το αν ο
 * χρήστης υπάρχει ήδη.
 * 2. Διαγραφή χρήστη. Εισάγεται το πλήρες ονοματεπώνυμο και ελέγχεται αν ο χρήστης υπάρχει. Αν ναι, να διαγράφεται ο χρήστης από
 * τον πίνακα. Αλλιώς να βγαίνει μήνυμα λάθους.
 * 3. Εκτύπωση όλων των χρηστών
 * 4. Έξοδος από το πρόγραμμα (και ενημέρωση του αρχείου)
 * Το μενού να λειτουργεί επαναληπτικά, δηλαδή π.χ. αν ο χρήστης κάνει μια εισαγωγή, να ξαναεμφανίζεται το μενού, ο χρήστης να κάνει
 * νέα επιλογή κ.ο.κ. μέχρι να κάνει έξοδο από το πρόγραμμα.
 */


public class Main {
    public static File f = new File("object_stream.bin");
    public static User[] users = new User[10];
    public static int numberOfUsers = 0;

    public static void main(String[] args) {

        if(f.isFile()) {
            try (ObjectInputStream os = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(f)))) {
                numberOfUsers = os.readInt();
                for (int i = 0; i < numberOfUsers; i++) {
                    users[i] = (User) os.readObject();
                }

            } catch (IOException | ClassNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }
            Scanner sc = new Scanner(System.in);
            int choice;

            while(true) {
                printMenu();
                choice = getChoice(sc);
                handleChoice(choice);
                if (choice == 4) {
                    System.out.println("Αντίο");
                    break;
                }
            }
        }


    public static void printMenu() {
        System.out.println("--------------------------------");
        System.out.println("1. Εισαγωγή Χρήστη");
        System.out.println("2. Διαγραφή Χρήστη");
        System.out.println("3. Εκτύπωση όλων των χρηστών");
        System.out.println("4. Έξοδος");
        System.out.println("--------------------------------");
    }

    public static int getChoice(Scanner sc){

        while(true){
            System.out.print("Παρακαλώ επιλέξτε ενέργεια: ");

               try {
                   if (!sc.hasNextInt()) {
                       sc.next();
                       throw new Exception("Παρακαλώ δώστε έγκυρη επιλογή");}
                   int choice = sc.nextInt();
                   if (choice > 4 | choice < 1) throw new Exception(
                           "Παρακαλώ εισάγετε αριθμό απο το 1 ως το 4");

                   return choice;
               } catch (Exception e) {
                   System.out.println("Error: " + e.getMessage());
               }

        }
    }

    public static void handleChoice(int n){
        switch(n){
            case 1:
                insertUser();
                break;

            case 2:
                deleteUser();
                break;

            case 3:
                printAllUsers();
                break;

            case 4:
                try(ObjectOutputStream os = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(f)))){
                    os.writeInt(numberOfUsers);
                    for(User user : users){
                        os.writeObject(user);
                    }

                }catch (IOException e){
                    System.err.println(e.getMessage());
                }
                break;
        }
    }

    public static void insertUser(){

        if(numberOfUsers >= 10) {
            System.out.println("Μέγιστος αριθμός χρηστών");
            return;
        }

        Scanner sc = new Scanner(System.in);
        String fullName;
        String username;
        String password;
        int role;

        System.out.println("Εισάγετε ονοματεπώνυμο: ");
        fullName = sc.nextLine();

        System.out.println("Εισάγετε username: ");
        username = sc.nextLine();

        System.out.println("Εισάγετε password: ");
        password = sc.nextLine();

        System.out.println("Εισάγετε ρόλο (1 για admin και 2 για user): ");
        role = sc.nextInt();

        User newUser = new User(fullName, username, password, role);

        users[numberOfUsers] = newUser;
        numberOfUsers ++;
    }

    public static void deleteUser() {
        Scanner sc = new Scanner(System.in);
        String fullName;

        System.out.println("Παρακαλώ εισάγετε το ονοματεπώνυμο του χρήστη που" +
                " θέλετε να διαγράψετε: ");

        fullName = sc.nextLine();

        for (int i = 0 ; i < numberOfUsers ; i ++){
            if (users[i].getFullName().equals(fullName)) {
                for (int j = i; j < numberOfUsers - 1; j++) {
                    users[j] = users[j + 1];
                }
                users[numberOfUsers - 1] = null;
                System.out.println("Ο χρήσητς διαγράφτηκε");
                numberOfUsers --;
                return;
            }
        }
        System.out.println("Δεν βρέθηκε χρήστης με όνομα: " + fullName);
    }

    public static void printAllUsers() {
        for (int i = 0 ; i < numberOfUsers ; i ++){
            if(users[i] != null) {
                System.out.println(users[i]);
                System.out.println("-------");
            }
        }
    }
}
