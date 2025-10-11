package SortingTechniques;

import java.util.Arrays;

public class SelectionSort {
    //    public static void swap(int[] arr,int i,int j){
//        int temp=i;
//        i=j;
//        j=temp;
//    }
    public static void sort(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Sorted array :" + Arrays.toString(arr));
        sort(arr, n);
        System.out.println("After Sorted array :" + Arrays.toString(arr));
    }
}
