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


    public static void main(String[] args) {
        int[] arr={0,1,2,1,2,1,0,0,0,1,0,2};

        System.out.println("brute :"+Arrays.toString(brute(arr)));
        System.out.println("brute :"+Arrays.toString(better(!arr)));
    }
}
