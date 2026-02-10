package BinarySearch;

public class MinimumInRotatedArray {
    public static int findMin(int[] nums) {
        int low=0, high=nums.length-1,ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else{
                high=mid-1;
                ans=Math.min(ans,nums[mid]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        System.out.println(findMin(arr));
    }
}
