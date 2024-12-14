package Cryptography;

/**
 * κωδικοποιησε τον 1ο χαρακτηρα του μηνυματος με την ακεραια τιμη που
 * αντιστοιχει  σε αυτον (ASCII) κωδικοποιησε τους επομενους χαρακτηρες
 * προσθετοντας την ακεραια ASCII τιμη του καθενα απο αυτους με τον
 * κωδικο του προηγουμενου του.
 *
 * υποθετουμε πως τα μηνυματα τελειωνουν με τον χαρακτηρα #
 *
 * θελουμε το κωδικοποιημενο μηνυμα να ειναι ακολουθια ακεραιων που τελειωνει
 * με -1
 *
 * Γραψε και τον αλγοριθμο αποκρυπτογραφησης που λαμβανει ως εισοδο μια
 * ακολουθια ακεραιων που τελειωνει με -1 και υπολογιζει το αρχικο μηνυμα
 */

import java.util.Scanner;

public class SimpleCryptographyApp {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s1;

            s1 = sc.nextLine();

            int[] arr = encryptFirst(s1);
            printArray(arr);

            String s2;

            s2 = decryptFirst(arr);
            System.out.println("Decrypted message : " + s2);

        }

        public static void printArray(int[] arr){
            for (int elem : arr ){
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        public static int[] encryptFirst(String input){
            int[] result = new int[input.length()];

            result[0] = (int)input.charAt(0);

            for(int i = 1 ; i < input.length(); i++){
                if(input.charAt(i) == '#') result[i] = -1;
                else result[i] = (int)input.charAt(i) + result[i-1];
            }

            return result;

        }

        public static String decryptFirst(int[] arr){
            StringBuilder sb = new StringBuilder();

            sb.append((char) arr[0]);
            for (int i = 1 ; i < arr.length ; i++){
                if(arr[i] == - 1) sb.append('#');
                else{
                    sb.append((char) (arr[i] - arr[i-1]));
                }
            }
            return sb.toString();
        }

}
