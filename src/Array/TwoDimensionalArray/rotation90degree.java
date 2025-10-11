package Array.TwoDimensionalArray;

import java.util.Scanner;

class rotate {

    static void printArray(int[][] a, int r1, int c1) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] a, int r1, int c1) {
        if (r1 != c1) {
            System.out.println("Transpose is not possible :");
            return;
        }
        System.out.println("Matrix after transpose :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                // Swap a[i][j] with a[j][i]
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
            System.out.println();
        }
        printArray(a, r1, c1);
    }

    static void reverseRows(int[][] a, int r1, int c1) {
        System.out.println("matrix after reverse rows");
        for (int i = 0; i < r1; i++) {
            int start = 0;
            int end = c1 - 1;
            while (start < end) {
                int temp = a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;
                start++;
                end--;
            }
        }
        printArray(a, r1, c1);

    }


    static void rotate(int[][] a, int r1, int c1) {
//        step1: transpose the matriix
        transpose(a, r1, c1);
//        step2: reverse the row
        reverseRows(a, r1, c1);
    }
}

public class rotation90degree {
    public static void main(String[] args) {
        rotate r = new rotate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no of matrix 1 :");
        int r1 = sc.nextInt();
        System.out.println("Enter column no of matrix 1 :");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter no of elements of matrix 1 :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        r.printArray(a, r1, c1);
        r.rotate(a, r1, c1);
        r.printArray(a, r1, c1);

    }
}
