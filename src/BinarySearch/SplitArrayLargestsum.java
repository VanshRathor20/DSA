package BinarySearch;

public class SplitArrayLargestsum {
    public static int findSum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    private static boolean canSplit(int[] nums, int k, int maxSum){
        int subarrays = 1;
        int sum = 0;

        for(int num : nums){
            if(sum + num > maxSum){
                subarrays++;
                sum = num;
            } else {
                sum += num;
            }
        }

        return subarrays <= k;
    }
    public static int splitArray(int[] nums, int k) {
        int low=0, high=findSum(nums), ans=-1;
        for(int num : nums){
            low = Math.max(low, num);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canSplit(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(splitArray(arr,2));
    }

}
