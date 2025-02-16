package StrongNumber;

import java.util.ArrayList;

/**
 * Strong number is a number with the sum of the factorial of its digits is equal to the number itself.
 *
 * For example, 145 is strong, because 1! + 4! + 5! = 1 + 24 + 120 = 145.
 *
 * Task
 * Given a positive number, find if it is strong or not, and return either "STRONG!!!!" or "Not Strong !!".
 *
 * Examples
 * 1 is a strong number, because 1! = 1, so return "STRONG!!!!".
 * 123 is not a strong number, because 1! + 2! + 3! = 9 is not equal to 123, so return "Not Strong !!".
 * 145 is a strong number, because 1! + 4! + 5! = 1 + 24 + 120 = 145, so return "STRONG!!!!".
 * 150 is not a strong number, because 1! + 5! + 0! = 122 is not equal to 150, so return "Not Strong !!".
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(isStrongNumber(1));
        System.out.println(isStrongNumber(123));
        System.out.println(isStrongNumber(145));
        System.out.println(isStrongNumber(150));

        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(1);
        ar1.add(4);
        ar1.add(5);

        System.out.println(sumFactorialOfList(ar1));


    }

    public static String isStrongNumber(int num) {
        int numInitial = num;
        ArrayList <Integer> digits = new ArrayList<>();
        while(num != 0){
            int digit = num % 10;
            digits.add(digit);
            num = num /10;
        }

        if (sumFactorialOfList(digits) == numInitial) return "STRONG!!!!";
        else return "Not Strong !!";


    }

    public static int sumFactorialOfList (ArrayList<Integer> arr){
        return arr.stream().reduce(0, (sum, n) -> sum + facto(n));
    }

    public static int facto (int number){
        if(number <= 1) return 1;
        return number * facto(number -1);
    }
}
