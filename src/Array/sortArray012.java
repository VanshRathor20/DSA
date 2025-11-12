package Array;

import java.util.Arrays;

public class sortArray012 {

    //brute
    public static int[] brute(int[] arr){
        Arrays.sort(arr);
        return arr;
    }


    public static void main(String[] args) {
        int[] arr={0,1,2,1,2,1,0,0,0,1,0,2};

        System.out.println("brute :"+Arrays.toString(brute(arr)));
    }
}
