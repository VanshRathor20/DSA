package SortingTechniques;

import java.util.Arrays;

public class QuickSort {
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quicksort(arr, low, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (arr[i] <= pivot && i <= high) {
                i++;
            }
            while (arr[j] >= pivot && j >= low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return j;

    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Sorted array :" + Arrays.toString(arr));
        quicksort(arr, 0, n - 1);
        System.out.println("After Sorted array :" + Arrays.toString(arr));
    }

}
