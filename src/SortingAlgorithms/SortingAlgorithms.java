package SortingAlgorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] arr = {18, 7, 4, 11, 9 , 20, 6 , 1, 22, 19, 14, 5, 2, 9, 10 ,13};
        printArray(arr);
        System.out.println();
        int[] arr1 = {6, 8, 14,};
        int[] arr2 = {1, 5, 9};
        int[] arr3 = {6};
        quickSort(arr,0, arr.length-1);
        printArray(arr);

    }

    static void quickSort(int[] arr, int s , int n){
        if (s< n) {
            int pi = partition(arr, s, n);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, s, pi);
            quickSort(arr, pi + 1, n);
        }
    }

    static int partition(int[] arr, int s, int n) {
        int pivot = arr[s];
        int i = s-1;  // Initialize left index
        int j = n+1; //initialize right index
        while(true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);
            if(i >= j) return j;
            swap(arr, i, j);
        }
    }
    static int[] mergeSort(int[] arr, int s , int n){

        if(n - s <= 0){ //Case with one or no element
            return new int[] {arr[n]};
        }

        if (n - s == 1) { // Case with two elements
            if (arr[s] > arr[n]) {
                swap(arr, s, n);
            }
            return new int[] {arr[s], arr[n]};
        }

        int middle = (n + s ) / 2;
        int[] left = mergeSort(arr, s , middle);
        int[] right = mergeSort(arr, middle+ 1, n);

        return merge(left, right);
    }

    static int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length + arr2.length;
        int[] mergedArr = new int[n];
        int mleft = 0;
        int mright = 0;
        int i = 0;

        while(mleft < arr1.length && mright < arr2.length){
            if(arr1[mleft] < arr2[mright]){
                mergedArr[i] = arr1[mleft];
                mleft++;
                i++;
            }else {
                mergedArr[i] = arr2[mright];
                mright++;
                i++;
            }
        }

        while(mleft < arr1.length){
            mergedArr[i] = arr1[mleft];
            mleft++;
            i++;
        }

        while(mright < arr2.length){
            mergedArr[i] = arr2[mright];
            mright++;
            i++;
        }
        return mergedArr;
    }

    static void swap(int[] arr, int a, int b){
        if(a >= arr.length || a < 0) return;
        if(b >= arr.length || b < 0) return;
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void printArray(int[] arr) {
        for (int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
