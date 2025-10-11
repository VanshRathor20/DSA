package Array.TwoDimensionalArray;

import java.util.Scanner;

class Twod{
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication is not possible");
            return;
        }
        int[][] c = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("After Multiplication of a matrix is :");
        printArray(c);
    }
}
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Twod t = new Twod();

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
        t.multiply(a, r1, c1, b, r2, c2);
    }
}
