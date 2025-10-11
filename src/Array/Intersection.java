package Array;

import java.util.*;
import java.util.ArrayList;

public class Intersection {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
//        List<Integer> intersection=new ArrayList<>(); if array is already sorted
        //if array is unsorted
        Set<Integer> intersection = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if ((arr1[i] == arr2[j])) {
                    intersection.add(arr1[i]);
                    break;
                }
            }
        }
        List<Integer> list = new ArrayList<>(intersection);
        return list;
    }


    public static List<Integer> findIntersectionOptimal(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if(arr2[j] < arr1[i]) {
                j++;
            }
            else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 4, 5, 6, 7, 8};
        System.out.println(findIntersection(arr1, arr2));

        System.out.println(findIntersectionOptimal(arr1, arr2));
    }

}
