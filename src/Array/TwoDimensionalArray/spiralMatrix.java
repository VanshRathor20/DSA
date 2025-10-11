package Array.TwoDimensionalArray;

import java.util.Scanner;

class spiral {

    static void printMatrix(int[][] a){
        System.out.println("given matrix is :");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void PrintspiralMatrix(int[][] matrix, int r, int c) {
        int topRow = 0, rightCol = c - 1, bottomRow = r - 1, leftCol = 0;
        int totalElements = 0;
        while (totalElements < r * c) {

            // toprow= leftcol-> rightcol
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            //rightcol=toprow->bottomrow
            for (int i = topRow ; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            //bottomrow=rightcol->leftcol
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            //leftcol=bottomrow->toprow
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
}

public class spiralMatrix {
    public static void main(String[] args) {
        spiral s=new spiral();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements row & columns :");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        System.out.println("Enter elements of matrix :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        s.printMatrix(matrix);
        System.out.println("spiral matrix is :");
        s.PrintspiralMatrix(matrix,r,c);

    }
}
