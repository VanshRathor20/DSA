package Array.Questions;

class largestElement {
    static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { // largest element in an array
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) { // largest element set to minimum value
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        for (int i = 0; i < arr.length; i++) { // second largest element in an array
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}

public class secondLargetElement {
    public static void main(String[] args) {
        largestElement le = new largestElement();
        int[] arr = {0,-2,0,-3,0,-4};
        System.out.println("Second Maximum element is: " + le.maxElement(arr));
//        System.out.println("Second maximum element is :" + le.maxElement(arr));
//        System.out.println("Third maximum element is :" + le.maxElement(arr));
//        System.out.println("Fourth maximum element is :" + le.maxElement(arr));
    }
}
