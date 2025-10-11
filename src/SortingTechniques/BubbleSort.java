package SortingTechniques;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
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
