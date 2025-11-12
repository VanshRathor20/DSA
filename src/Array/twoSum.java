package Array;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    //brute solution
    public static int[] brute(int[] arr,int t){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1,-1} ;
    }

    //better solution
    public static int[] better(int[] arr,int target){
        HashMap<Integer,Integer> map= new HashMap<Integer, Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int moreNeed=target-arr[i];
            if(map.containsKey(moreNeed)){
                return new int[] {map.get(moreNeed),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }

    //optimal solution
    public static int[] optimal(int[] arr,int t){
        int n=arr.length;
        Arrays.sort(arr);
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==t){
                return new int[] {i,j};
            }
            else if(arr[i]+arr[j]<t){
                i++;
            }
            else{
                j--;
            }

        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        System.out.println("brute approach: " + Arrays.toString(brute(arr, 9)));
        System.out.println("better approch :" + Arrays.toString(better(arr, 9)));
        System.out.println("better approch :" + Arrays.toString(optimal(arr, 9)));

    }
}
