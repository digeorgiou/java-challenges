package EqualSidesOfAnArray;

import java.util.Arrays;

/**
 * You are going to be given an array of integers. Your job is to take that array
 * and find an index N where the sum of the integers to the left of N is
 * equal to the sum of the integers to the right of N.
 *
 * If there is no index that would make this happen, return -1.
 *
 * For example:
 * Let's say you are given the array {1,2,3,4,3,2,1}:
 * Your function will return the index 3, because at the 3rd position of the array,
 * the sum of left side of the index ({1,2,3}) and the sum of
 * the right side of the index ({3,2,1}) both equal 6.
 *
 * Let's look at another one.
 * You are given the array {1,100,50,-51,1,1}:
 * Your function will return the index 1, because at the 1st position of the array,
 * the sum of left side of the index ({1}) and the sum of the right side
 * of the index ({50,-51,1,1}) both equal 1.
 *
 * Last one:
 * You are given the array {20,10,-80,10,10,15,35}
 * At index 0 the left side is {}
 * The right side is {10,-80,10,10,15,35}
 * They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
 * Index 0 is the place where the left side and right side are equal.
 *
 * Note: Please remember that in most languages the index of an array starts at 0.
 *
 * Input
 * An integer array of length 0 < arr < 1000. The numbers in the array can be any integer positive or negative.
 *
 * Output
 * The lowest index N where the side to the left of N is equal to the side to the right of N.
 * If you do not find an index that fits these rules, then you will return -1.
 *
 * Note
 * If you are given an array with multiple answers, return the lowest correct index.
 */




public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,3,2,1};
        int[] arr2 = new int[] {1,100, 50, -51,1,1};
        int[] arr3 = new int[] {20,10,-80,10,10,15,35};
        int[] arr4 = new int[] {1,2,3,4,5,6};
        int[] arr5 = new int[] {20,10,30,10,10,15,35}   ;
        int[] arr6 = new int[] {-8505, -5130, 1926, -9026};
        int[] arr7 = new int[] {2824, 1774, -1490, -9084, -9696, 23094};
        int[] arr8 = new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};



        System.out.println(findEvenIndex(arr));
        System.out.println(findEvenIndex(arr2));
        System.out.println(findEvenIndex(arr3));
        System.out.println(findEvenIndex(arr4));
        System.out.println(findEvenIndex(arr5));
        System.out.println(findEvenIndex(arr6));
        System.out.println(findEvenIndex(arr7));
        System.out.println(findEvenIndex(arr8));

    }

    public static int findEvenIndex(int[] arr) {
        if(getSum(arr,0, arr.length) == 0) return 0;
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(getSum(arr,i+1, arr.length) == sum) return i;
            sum += arr[i];
        }
        return -1;
    }

    public static int getSum(int[] arr, int start, int end){
        int sum = 0;
        for (int i = start ; i < end ; i++ ){
            sum += arr[i];
        }
        return sum;
    }

    public static int findEvenIndex2(int[] arr) {
        int left = 0;
        int right = Arrays.stream(arr).sum();
        for (int i=0; i<arr.length; i++){
            right -= arr[i];
            if (left == right) return i;
            left += arr[i];
        }
        return -1;
    }
}
