package Array;

import java.util.Arrays;

public class sortArray012 {

    //brute
    public static int[] brute(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    //better
    public static int[] better(int[] arr){
        int n=arr.length;
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) c0++;
            else if(arr[i]==1) c1++;
            else c2++;
        }

        //write values into the array
        for(int i=0;i<c0;i++){
            arr[i]=0;
        }
        for(int i=c0;i<c1;i++){
            arr[i]=1;
        }
        for(int i=c1;i<c2;i++){
            arr[i]=2;
        }
        return arr;
    }

    //optimal
    public static int[] sort012(int[] arr) {
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        return arr;

    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,1,2,1,0,0,0,1,0,2};

        System.out.println("brute :"+Arrays.toString(brute(arr)));
        System.out.println("better :"+Arrays.toString(better(arr)));
        System.out.println("optimal :"+Arrays.toString(sort012(arr)));

    }
}




