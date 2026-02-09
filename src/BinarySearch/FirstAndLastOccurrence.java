package BinarySearch;
import java.util.*;
public class FirstAndLastOccurrence {
    //brute
    public static int[] firstAndLastOccurrence(int[] arr,int target){
        int first=LowerBound.LowerBound(arr,target);
        int last=UpperBound.UpperBound(arr,target)-1;

        if(first==arr.length || arr[first]!=target){
            return new int[]{-1, -1};
        }
        return new int[]{first, last};
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,6,7,8,9};
        int[] ans=firstAndLastOccurrence(arr,5);
        System.out.println(Arrays.toString(ans));
    }
}
