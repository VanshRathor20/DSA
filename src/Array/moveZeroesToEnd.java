package Array;

import java.util.Arrays;

public class moveZeroesToEnd {
    public static void movezeroestoend(int[] arr){
        int n=arr.length;
//        int [] temp=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            arr[i]=0;
        }
    }

    public static int[] moveZerosOptimal(int n, int[] a) {
        int j = -1;
        // Find the index of the first zero
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zeros are found, return the array as is
        if (j == -1) {
            return a;
        }

        // Iterate from the first zero and swap with non-zero elements
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                // Swap elements
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                // Move the zero pointer to the next position
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,2,0,4,0,6,0};
//        movezeroestoend(arr);
        moveZerosOptimal(args.length,a);
        System.out.println("After opr :"+ Arrays.toString(a));
    }
}


