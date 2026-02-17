package BinarySearch;

public class findKmissingNo {
    public static int brute(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k) k++;
            else break;
        }
        return k;
    }


    //optimal
    public static int findKthPositive(int[] arr, int k) {
        int low=0, high=arr.length-1;
        while(low<=high){
            int  mid=low+(high-low)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return high+1+k;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        System.out.println(brute(arr,5));
        System.out.println(findKthPositive(arr,5));

    }
}
