package Array.Questions;

class Example {

    void sumOfArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum of array is :" + sum);
    }

    void maxElement() {
        int[] arr = {1, 4, 2, 7, 8, 54, 3, 43, 12};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("maximum element is " + max);
    }

    void indexOfElement() {
        int[] arr = {1, 4, 2, 7, 8, 54, 3, 43, 12};
        int search = 878;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                ans = i;
                System.out.println("index is " + ans);
                break;
            }
//            System.out.println("-1");
        }
    }

    static int countOccurence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    int lastOccurence(int[] arr, int x) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                pos++;
            }
        }
        return pos;
    }

    int countStrictlyGreaterThan(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    static boolean isSorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                check =false;
                break;
            }
        }
        return check;
    }
}

public class arrBasicQues {
    public static void main(String[] args) {
        Example eg = new Example();
//        eg.sumOfArray();

//        eg.maxElement();

//        eg.indexOfElement();

//        int[] arr = {1, 9, 8, 7, 3, 4, 5, 6};   //unsorted array

        int[] arr={1,2,3,4,5,6,7,8,9};           // sorted array

//        System.out.println("count of occurence :"+eg.countOccurence(arr,3));

//        System.out.println("last of occurence :"+eg.lastOccurence(arr,3));

//        System.out.println("count Strictly Greater Than"+eg.countStrictlyGreaterThan(arr,3));

//        System.out.println(eg.isSorted(arr));
        
        System.out.println("Is Sorted "+eg.isSorted(arr));

    }
}
