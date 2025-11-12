package Array;

import java.util.Arrays;

public class twoSum {
    public static int[] brute(int[] arr,int t){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1,-1} ;
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        System.out.println("brute approach: " + Arrays.toString(brute(arr, 9)));
    }
}
