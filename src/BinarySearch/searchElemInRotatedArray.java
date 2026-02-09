package BinarySearch;

public class searchElemInRotatedArray {
    public static int search(int[] nums, int target) {
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[low]<=nums[mid]){
                if(nums[mid]>target && nums[low]<=target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }

            else{
                if(nums[mid]<target && nums[high]>=target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={7,8,9,1,2,3,4,5,6};
        System.out.println(search(arr,8));
    }
}
