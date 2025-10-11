package Array;

public class SmallestElement {
    static void FirstSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("First Maximum Element in Array :" + min);
    }
    static void SecongSmallest(int[] arr,int n){
        int min=arr[0];
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if( arr[i]<smin){
                smin=min;
                min=arr[i];
            }
        }
        System.out.println("Second Smallest :"+smin);
    }


    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n=arr.length;
        FirstSmallest(arr);
        SecongSmallest(arr,n);

    }
}
