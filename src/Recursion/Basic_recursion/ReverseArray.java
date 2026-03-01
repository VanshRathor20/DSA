package Recursion.Basic_recursion;

import java.util.Arrays;

public class ReverseArray {
    // recursive
    public static void recursive(int[] arr,int left, int right){
        if(left>=right) return ;
        // swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        recursive(arr,left+1,right-1);
    }

    public static void main(String[] args) {
        ReverseArray sol=new ReverseArray();
        int[] arr={1,2,3,4,5};
        recursive(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
