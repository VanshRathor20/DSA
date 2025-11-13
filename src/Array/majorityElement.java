package Array;

import java.util.Arrays;

public class majorityElement {
    //brute
    public static int brute(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
            }
            if(count>(n/2)) {
                return arr[i];
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr={2,2,3,3,2,2};
        System.out.println("brute :"+(brute(arr)));
    }
}
