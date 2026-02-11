package BinarySearch;

public class findPeakElem {
    public static int peakElement(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if((i==0 || arr[i-1]<arr[i]) && (i==n-1 || arr[i]>arr[i+1])){
                return arr[i];
            }
        }
        return -1;
    }
    public static int findPeakElement(int[] nums) {
        int n=nums.length;
        if (n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;

        int low=1, high=n-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]> nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }
            else if(nums[mid]>nums[mid+1]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8,5,1};
        System.out.println( peakElement(arr));
        System.out.println(findPeakElement(arr));
    }
}
