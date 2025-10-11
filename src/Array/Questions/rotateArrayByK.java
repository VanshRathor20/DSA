package Array.Questions;
import java.util.Arrays;

class rotate {
    static void swap(int [] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

    }

    static void reverse(int [] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

//    static int[] rotateArrayByK(int[] arr, int k) {               // rorate array by k using extra space
//        int n = arr.length;
//        k = k % n;
//        int[] ans = new int[n];
//        int j = 0;
//        for (int i = n - k; i < n; i++) {
//            ans[j++] = arr[i];
//        }
//        for (int i = 0; i < n - k; i++) {
//            ans[j++] = arr[i];
//
//        }
//        return ans;
//    }

    static void rotateArrayByKInPlace(int[] arr,int k){    // rorate array by k without using extra space
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
}

public class rotateArrayByK {
    public static void main(String[] args) {
        rotate r = new rotate();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        System.out.println(Arrays.toString(r.rotateArrayByK(arr, 2)));
        r.rotateArrayByKInPlace(arr,102);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
}
