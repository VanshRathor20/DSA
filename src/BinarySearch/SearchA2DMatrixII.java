package BinarySearch;

public class SearchA2DMatrixII {
    public SearchA2DMatrixII(int[][] matrix) {
    }

    public boolean searchMatrix(int[][] matrix,int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while(row < n && col >= 0){
            if(matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        SearchA2DMatrixII ms = new SearchA2DMatrixII(matrix);
        boolean found = ms.searchMatrix(matrix,8);
        System.out.println(found); // true
    }
}
