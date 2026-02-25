package BinarySearch;

public class rowWithMax1S {
    public static int brute(int[][] matrix,int n,int m){
        int cntMax=0, index=-1;
        for(int i=0;i<n;i++){
            int cntOnes=0;
            for(int j=0;j<m;j++){
                cntOnes+=matrix[i][j];
            }
            if(cntOnes>cntMax){
                cntMax=cntOnes;
                index=i;
            }
        }
        return  index;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int n = 3, m = 3;
        rowWithMax1S obj = new rowWithMax1S();
        System.out.println("The row with maximum no. of 1's is: " + obj.brute(matrix, n, m));

    }
}
