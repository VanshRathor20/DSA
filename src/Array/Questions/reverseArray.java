package Array.Questions;

class array {    // mera method
    static int reverse(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            System.out.println(arr[i]);
        }
        return arr[0];
    }
}

public class reverseArray {
    public static void main(String[] args) {
        array a = new array();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(a.reverse(arr));
    }

}


// 🔁 Two-Pointer Approach
class ArrayUtil {
    static void reverse(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reverse(arr);

        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
