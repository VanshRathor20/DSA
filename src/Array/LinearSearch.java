package Array;

import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr,int key){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
//        linearSearch(arr,5);
        int resultIndex=linearSearch(arr,5);
        if(resultIndex!=-1){
            System.out.println("Element found at indx :"+resultIndex);
        }
        System.out.println("Element not found in the array. :"+resultIndex);
    }
}
