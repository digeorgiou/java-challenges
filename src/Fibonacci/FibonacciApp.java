package Fibonacci;

/**
 *  Η ακολουθία fibonacci ορίζεται ως:
 *  Fn=Fn-1+Fn-2, για n>2
 *  F2=1
 *  F1=1
 * Για παράδειγμα έχουμε F1=1,F2=1,F3=2,F4=3,F5=5,F6=8 κ.ο.κ.
 * Ορίστε την συνάρτηση fibonacci(n) που δέχεται ως όρισμα έναν φυσικό και επιστρέφει το n-
 * οστό fibonacci.
 * Έπειτα κατασκευάστε έναν αλγόριθμο που διαβάζει από τον χρήστη έναν
 * ακέραιο και
 * υπολογίζει και επιστρέφει τον αριθμό fibonacci του αριθμού που εισήγαγε ο χρήστης.

 */

public class FibonacciApp {

    public static void main(String[] args) {

        System.out.println(calculateFibbonaci(2));
        System.out.println(calculateFibbonaci(3));
        System.out.println(calculateFibbonaci(4));
        System.out.println(calculateFibbonaci(5));
        System.out.println(calculateFibbonaci(6));
        System.out.println(calculateFibbonaci(7));
        System.out.println(calculateFibbonaci(8));
        System.out.println(calculateFibbonaci(16));

    }

    static int calculateFibbonaci (int n ){
        if (n < 1) return -1;
        if(n <= 2) return 1;
        else {
            return calculateFibbonaci(n-1) + calculateFibbonaci(n - 2);
        }
    }
}
