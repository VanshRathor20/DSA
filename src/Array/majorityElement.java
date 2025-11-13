package Array;

import java.util.Arrays;
import java.util.HashMap;

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

    //better
    public static int better(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>(n/2)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,2,3,3,2,2};
        System.out.println("brute :"+(brute(arr)));
        System.out.println("brute :"+(better(arr)));
    }

}
