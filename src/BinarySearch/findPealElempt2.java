package BinarySearch;

public class findPealElempt2 {
    public static int maxElem(int[][] arr,int col){
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i][col]>max){
                max=arr[i][col];
                index=i;
            }
        }
        return index;
    }

    public static int[] findPeakGrid(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int low=0, high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=maxElem(arr,mid);
            int left=mid-1>=0?arr[row][mid-1]:Integer.MIN_VALUE;
            int right=mid+1<m?arr[row][mid+1]:Integer.MIN_VALUE;

            if(arr[row][mid]>left && arr[row][mid]>right){
                return new int[]{row,mid};
            }else if(arr[row][mid]<left){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] mat = {
                {4, 2, 5, 1, 4, 5},
                {2, 9, 3, 2, 3, 2},
                {1, 7, 6, 0, 1, 3},
                {3, 6, 2, 3, 7, 2}
        };

        findPealElempt2 sol = new findPealElempt2();
        int[] peak = sol.findPeakGrid(mat);

        System.out.println("The row of the peak element is " + peak[0] +
                " and the column of the peak element is " + peak[1]);
    }

}
