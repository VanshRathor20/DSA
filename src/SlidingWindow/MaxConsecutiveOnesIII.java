package SlidingWindow;

public class MaxConsecutiveOnesIII {
    // brute
    public static int brute(int[] arr, int k){
        int n=arr.length, maxLen=0;
        for(int i=0;i<n;i++){
            int cntZeroes=0;
            for(int j=i;j<n;j++){
                if(arr[j]==0) cntZeroes++;
                if(cntZeroes<=k){
                    int len=j-i+1;
                    maxLen=Math.max(maxLen,len);
                }
                else {
                    break;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        MaxConsecutiveOnesIII sol=new MaxConsecutiveOnesIII();
        System.out.println(sol.brute(arr,2));
    }
}
