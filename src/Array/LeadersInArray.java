package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersInArray {
    //brute
    public static ArrayList<Integer> brute(ArrayList<Integer> arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.size();
        for(int i=0;i<n;i++){
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(arr.get(j)>arr.get(i)){
                    leader=false;
                    break;
                }
            }
            if(leader==true){
                ans.add(arr.get(i));
            }
        }
        return ans;
    }

    //optimal
    public static ArrayList<Integer> optimal(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                result.add(max);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        System.out.println(brute(list));
    }
}
