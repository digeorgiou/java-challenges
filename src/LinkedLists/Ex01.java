package LinkedLists;

import java.util.LinkedList;
import java.util.Random;

/**
 * Ορίστε δύο LinkedList από αντικείμενα Integer και έπειτα:
 * • Το 1ο LinkedList να περιέχει 10 τυχαίους ακεραίους στο εύρος
 * [0,20)
 * • To 2ο LinkedList να περιέχει 20 τυχαίους ακεραίους στο εύρος
 * [0,40)
 * (να γίνεται έλεγχος ώστε τα στοιχεία που περιέχει κάθε λίστα να
 * είναι μοναδικά)
 * τυπώστε τα περιεχόμενά των δύο λιστών και έπειτα:
 * • υπολογίστε την τομή τους, δηλαδή τα στοιχεία που
 * περιέχονται τόσο στην 1η, όσο και στη 2η λίστα.
 * • αποθηκεύστε τα στοιχεία αυτά σε ένα νέο LinkedList
 * • Τυπώστε το LinkedList της τομής.
 */

public class Ex01 {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        Random random = new Random();

        for(int i = 0 ; i < 10 ; i++){
            while(true) {
                int num = random.nextInt(20);
                if(!l1.contains(num)) {
                    l1.add(num);
                    break;
                }
            }
        }
        for(int i = 0 ; i < 20 ; i ++){
            while(true) {
                int num = random.nextInt(40);
                if(!l2.contains(num)) {
                    l2.add(num);
                    break;
                }
            }
        }

        System.out.println(l1);
        System.out.println(l2);

        l2.retainAll(l1);

        System.out.println(l2);




    }
}
