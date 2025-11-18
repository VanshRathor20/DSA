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


    // IF THE POSITIVE & NEGATIVE ARE NOT EQUAL
        static void rearrange(ArrayList<Integer> arr) {
            ArrayList<Integer> pos = new ArrayList<>();
            ArrayList<Integer> neg = new ArrayList<>();

            // Separate positive and negative numbers
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) >= 0)
                    pos.add(arr.get(i));
                else
                    neg.add(arr.get(i));
            }

            int posIdx = 0, negIdx = 0;
            int i = 0;

            // Place positive and negative numbers alternately
            // in the original array
            while (posIdx < pos.size() && negIdx < neg.size()) {
                if (i % 2 == 0)
                    arr.set(i++, pos.get(posIdx++));
                else
                    arr.set(i++, neg.get(negIdx++));
            }

            // Append remaining positive numbers (if any)
            while (posIdx < pos.size())
                arr.set(i++, pos.get(posIdx++));

            // Append remaining negative numbers (if any)
            while (negIdx < neg.size())
                arr.set(i++, neg.get(negIdx++));
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

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -1, 4));
        rearrange(arr1);
        for (int i = 0; i < arr1.size(); i++)
            System.out.print(arr1.get(i) + " ");

    }
}
