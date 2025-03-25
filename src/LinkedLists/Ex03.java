package LinkedLists;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Για τον υπολογισμό της δυαδικής αναπαράστασης ενός ακέραιου αριθμού
 * κάνουμε διαδοχικές διαιρέσεις με το 2.
 * • Εισάγουμε τα διαδοχικά υπόλοιπα σε μία στοίβα
 * • και έπειτα εξάγοντας τα έχουμε τη δυαδική του αναπαράσταση
 *
 * Κατασκευάστε μέθοδο η οποία με όρισμα n να επιστρέφει τη δυαδική του
 * αναπαράσταση (ως συμβολοσειρά).
 */

public class Ex03 {

    public static void main(String[] args) {


        LinkedList<Integer> stack = new LinkedList<>();
        String binForm = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Give an integer: ");
        int num = sc.nextInt();

        while(num != 0){
            stack.push(num%2);
            num /= 2;
        }

        while(stack.peek()!= null)
            binForm += stack.pop();

        System.out.println(binForm);
    }
}
