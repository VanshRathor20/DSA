package Array;

import java.util.Arrays;

public class ThreeSum {
    public static int[] brute(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        return new int[] {arr[i],arr[j],arr[k]};
                    }
                }
            }
        }
        return new int[] {-1,-1,-1};
    }

    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString(ThreeSum.brute(arr,0)));
    }

}
