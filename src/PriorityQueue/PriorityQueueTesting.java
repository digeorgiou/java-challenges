package PriorityQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueTesting {

    public static void main(String[] args) {

        PriorityQueue<Integer> p = new PriorityQueue<>();
        LinkedList<Integer> l = new LinkedList<>();

        p.add(6);
        p.add(5);
        p.add(4);
        p.add(3);

        l.add(6);
        l.add(5);
        l.add(4);
        l.add(3);

        //στην PriorityQueue διατασσονται τα στοιχεια συμφωνα με την φυσικη
        // τους διαταξη, εκτος αν χρησιμοποιηθει ενας Comparator
        System.out.println("p: " + p);

        //τα στοιχεια στην LinkedList κρατανε την σειρα με την οποια μπηκαν
        System.out.println("l: " + l);
    }
}
