package Array.TwoDimensionalArray;

import java.util.Scanner;

class Two {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


//    this method only print not actually transpose the matrix
//    static void transpose(int[][] a, int r1, int c1) {
//        if (r1 != c1) {
//            System.out.println("Transpose is not possible :");
//            return;
//        }
//        System.out.println("MAtrix before transpose :");
//        printArray(a);
//        System.out.println("Matrix after transpose :");
//        for (int i = 0; i < c1; i++) {
//            for (int j = 0; j < r1; j++) {
//                System.out.print(a[j][i] + " ");
//            }
//            System.out.println();
//        }
//    }

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
        printArray(a);
    }
}

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Two t = new Two();

        System.out.println("Enter no of rows of matrix 1 :");
        int r1 = sc.nextInt();
        System.out.println("Enter no of columns of matrix 1 :");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter elements of matrix 1");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no of rows of matrix 2 :");
        int r2 = sc.nextInt();
        System.out.println("Enter no of columns of matrix 2 :");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter elements of matrix 2");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        t.transpose(a, r1, c1);

    }
}
