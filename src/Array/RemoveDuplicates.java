package Array;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3};
        int newLength=removeDuplicates(arr);
        System.out.println("Length after remvoing duplicate values :"+newLength);
        System.out.print("Array without duplicates: ");
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
