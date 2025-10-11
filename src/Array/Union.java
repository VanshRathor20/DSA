package Array;

import java.util.*;
import java.util.ArrayList;

public class Union {
    public static List<Integer> sortedArray(List<Integer> a, List<Integer> b) {
        // Merge both lists
        List<Integer> merged = new ArrayList<>();
        merged.addAll(a);
        merged.addAll(b);

        // removing duplicate & sort
        Set<Integer> set = new TreeSet<>(merged);
        return new ArrayList<>(set);
    }


    //optimal solution
    public static List<Integer> unionOptimal(int[] arr1, int[] arr2) {
        //creating new array that store the values of both the array
        List<Integer> union = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {// elements are equal
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                i++;
                j++;
            }
        }
        // adding remaining elements
        while (i < n1) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4);
        List<Integer> b = Arrays.asList(2, 3, 5);
        System.out.println(sortedArray(a, b));
        System.out.println("Brute approach done successfully...");

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 5};
        System.out.println((unionOptimal(arr1, arr2)));
        System.out.println("Optimal approach done successfully...");


    }
}
