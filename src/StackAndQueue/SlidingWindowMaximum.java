package StackAndQueue;

import java.util.Arrays;

public class SlidingWindowMaximum {
    public static int[] brute(int[] arr,int k){
        int n=arr.length;
        int[] ans=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            ans[i]=max;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(brute(arr,k)));
    }

}
