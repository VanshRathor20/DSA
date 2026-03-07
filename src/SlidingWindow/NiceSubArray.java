package SlidingWindow;

public class NiceSubArray {
    //brute
    public static int brute(int[] arr,int k){
        int odd=0,cnt=0, n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j]%2==1){
                    odd++;
                }
                if(odd>k){
                    break;
                }
                if(odd==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static int atMost(int[] nums,int k){
        int left = 0, res = 0;

        // Traverse through the array
        for (int right = 0; right < nums.length; right++) {
            // If current number is odd, reduce k
            if (nums[right] % 2 != 0)
                k--;

            // Shrink the window until k is valid
            while (k < 0) {
                if (nums[left] % 2 != 0)
                    k++;
                left++;
            }

            // Add valid subarrays ending at right
            res += (right - left + 1);
        }

        // Return result
        return res;
    }
    public static int optimal(int[] nums,int k ){
        return atMost(nums,k)-atMost(nums,k-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 1};
        NiceSubArray sol=new NiceSubArray();
        System.out.println(sol.brute(arr,3));
        System.out.println(sol.optimal(arr,3));

    }
}
