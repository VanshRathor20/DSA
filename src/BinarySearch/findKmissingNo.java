package BinarySearch;

public class findKmissingNo {
    public static int brute(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k) k++;
            else break;
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        System.out.println(brute(arr,5));
    }
}
