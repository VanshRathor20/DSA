package Array;

public class LargetElement {
    static void FirstLarget(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("First Maximum Element in Array :" + max);
    }

    static void SLargest(int[] arr) {
        int secondLargest = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i=0;i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Maximum Element in Array :" + secondLargest);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        FirstLarget(arr);
        SLargest(arr);
    }
}
