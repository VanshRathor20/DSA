package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rearrangeElementAccToSign {
    public static int[] brute(ArrayList<Integer> arr){
        int n= arr.size();
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr.get(i)<0){
                neg.add(arr.get(i));
            }else{
                pos.add(arr.get(i));
            }
        }

        int[] ans=new int[n];
        for(int i=0;i<n/2;i++){
            ans[2*i]=pos.get(i);
            ans[2*i+1]=neg.get(i);
        }
        return ans;
    }

    //optimal
    public static int[] optimal(int[] arr){
        int n=arr.length;
        int[] anss=new int[n];
        int k=0,j=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                anss[j]=arr[i];
                j=j+2;
            }
            else{
                anss[k]=arr[i];
                k=k+2;
            }
        }
        return anss;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};

        // convert int[] → ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : arr) list.add(x);

        // Call brute
        int[] result = brute(list);

        // Print
        System.out.println("brute : " + Arrays.toString(result));

        int[] result2=optimal(arr);
        System.out.println("optimal :"+Arrays.toString(result2));

    }
}
