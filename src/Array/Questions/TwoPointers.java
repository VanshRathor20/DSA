package Array.Questions;

class pointers {
    // print Array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sortedZeroesAndOnes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) { // print zeroes -1 tak
            System.out.print("0" + " ");
        }
        for (int i = count; i < arr.length; i++) {
            System.out.print("1" + " ");
        }
    }

    static void sortedByPointerApprocah(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (arr[start] == 1 && arr[end] == 0) {
                swap(arr, start, end);
                start++;
                end--;
            }
            if (arr[start] == 0) {
                start++;
            }
            if (arr[end] == 1) {
                end--;
            }
        }
    }

    static void evenOdd(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 != 0) {
                j--;
            }
        }
    }

    static void sortSquare(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1, k = 0;
        int[] ans = new int[n];
        while (left < right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                k++;
                left++;
            } else {
                ans[k] = arr[right]*arr[right];
                k++;
                right--;
            }
        }

    }
}


public class TwoPointers {
    public static void main(String[] args) {
//        int[] arr={1,1,1,0,0,0,1,0,1,0,0,0};         //sortedZeroesAndOnes
//        int[] arr={7,2,19,16,14,12};                //evenOdd
//        int[] arr={10,2,19,4,33,22};               //squareThenSort
        int[] arr = {-10, -3, -21, 4, 5};                // sortSquare
//        0,0,0,0,0,0,0,1,1,1,1,1
        pointers p = new pointers();

//        System.out.println("Original Array :");
//        p.printArray(arr);
//        System.out.println();
//        System.out.println("Sorted Array :");
//        p.sortedByPointerApprocah(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

//        p.evenOdd(arr);

//        p.squareThenSort(arr);

        p.sortSquare(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
