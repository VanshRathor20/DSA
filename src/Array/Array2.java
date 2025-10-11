package Array;

import java.util.Scanner;

//Arrays- 2| Taking Input, Array Reference, Cloning and Copy
public class Array2 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of any array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of an array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing elements of any array :");
        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
        }

        int[] arr2 = arr.clone();
        printArray(arr2);
        arr2[0]=2;

    }
}
