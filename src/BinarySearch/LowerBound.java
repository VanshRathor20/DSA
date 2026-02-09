package BinarySearch;

public class LowerBound {
    public static int LowerBound(int[] arr,int target){
        int low=0, high=arr.length-1, ans=arr.length;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,6,7,8,9};
        System.out.println(LowerBound(arr,5));
    }

}
