package SortingTechniques;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("Sorted array is :" + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {14, 9, 15, 12, 6, 8, 13};
        System.out.println("Before Sorted array :" + Arrays.toString(arr));
        sort(arr, arr.length);

    }
}
