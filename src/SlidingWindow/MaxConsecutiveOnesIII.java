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

    //better
    public static int better(int[] arr,int k){
        int maxLen=0, n=arr.length,l=0,r=0, zero=0;
        while(r<n){
            if(arr[r]==0) zero++;
            while(zero>k){
                if(arr[l]==0){
                    zero--;
                }
                l++;
            }
            int len=r-l+1;
            if(zero<=k){
                maxLen=Math.max(maxLen,len);
                r++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        MaxConsecutiveOnesIII sol=new MaxConsecutiveOnesIII();
//        System.out.println(sol.brute(arr,2));
        System.out.println(sol.better(arr,2));
    }
}
