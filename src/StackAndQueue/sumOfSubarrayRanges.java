package StackAndQueue;

public class sumOfSubarrayRanges {
    public static int brute(int[] arr){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int large=arr[i];
            int small=arr[i];
            for(int j=i+1;j<n;j++){
                large=Math.max(large,arr[j]);
                small=Math.min(small,arr[j]);
                sum=sum+(large-small);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={1,4,3,2};
        sumOfSubarrayRanges sol=new sumOfSubarrayRanges();
        System.out.println(sol.brute(arr));
    }
}
