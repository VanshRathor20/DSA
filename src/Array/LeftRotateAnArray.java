package Array;

import java.util.Arrays;

public class LeftRotateAnArray {
    public static int[] rotateArrayByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    // brute approch
    public static int[] rotateByK(int[] arr, int n, int k) {
        k = k % n;
        int[] temp = new int[k]; // storing elements of array in temp arr
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) { // shifting elments in -1 indexes
            arr[i - k] = arr[i];
        }
        for (int i = n-k ; i < n; i++) { //add temp array in end of the array
            arr[i] = temp[i-(n - k)];
        }
        return arr;
    }

    // optimal aaproch
        // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            }
        }

        public static void leftRotate(int[] arr, int d) {
            int n = arr.length;
            d = d % n; // Handle rotations greater than length

            reverse(arr, 0, d - 1);     // Reverse first d elements
            reverse(arr, d, n - 1);     // Reverse the rest
            reverse(arr, 0, n - 1);     // Reverse entire array
        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        rotateArrayByOne(arr);
//        rotateByK(arr,arr.length,3);
        leftRotate(arr,3);
        System.out.println("Rotated Array :" + Arrays.toString(arr));
    }
}

