package LinkedLists.Ex02;

import java.util.Scanner;

/**
 * Κατασκευάστε μία κλάση - ευρετήριο λέξεων. Συγκεκριμένα θα
 * έχει ως μέλος:
 * • Ένα ArrayList 26 θέσεων (όσα και τα γράμματα του λατινικού
 * αλφάβητου)
 * • Κάθε στοιχείο του ArrayList είναι μία συνδεδεμένη λίστα
 * συμβολοσειρών.
 * Θα έχει τις μεθόδους:
 * • Κατασκευαστής: Αρχικοποιεί τη δομή.
 * • add(String): Προσθέτει τη συμβολοσειρά που δέχεται ως
 * όρισμα, στο τέλος της λίστας του αντιστοίχου γράμματος (να
 * γίνεται έλεγχος αν η λέξη υπάρχει ήδη)
 * • toString(): Εκτυπώνει το γράμμα και έπειτα τη λίστα με τις
 * λέξεις που έχουμε προσθέσει σε αυτό.
 * Στη main():
 * • Κατασκευάστε ένα βρόχο που θα διαβάζει λέξεις από το
 * πληκτρολόγιο (μέχρι να πληκτρολογηθεί quit) και θα τις
 * προσθέτει στη δομή.
 * • Όταν γίνει έξοδος από το βρόχο, να εκτυπώνεται η δομή.
 */



public class Main {

    public static void main(String[] args) {


        IndexList list = new IndexList();

        try (Scanner sc = new Scanner(System.in)){
            String s = "";

            while(true){
                System.out.print("Give Word: ");
                s = sc.next();

                if(s.equals("quit"))
                    break;

                char[] characters = s.toCharArray();
                boolean valid = true;
                for(var c : characters){
                    if(!Character.isAlphabetic(c)){
                        System.out.println("Wrong Input!");
                        valid = false;
                        break;
                    }
                }

                if(valid) list.add(s);

            }


        }

        System.out.println(list);
    }
}
