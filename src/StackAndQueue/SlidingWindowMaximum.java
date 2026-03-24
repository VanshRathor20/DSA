package StackAndQueue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

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

    //optimal
    public static int[] optimal(int[] nums,int k){
        Deque<Integer> dq = new LinkedList<>();
        int n=nums.length;
        // List to store result
        int[] result = new int[n - k + 1];
        int idx = 0;
        for( int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() &&nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                result[idx++] = nums[dq.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(brute(arr,k)));
        System.out.println(Arrays.toString(optimal(arr,k)));
    }

}
