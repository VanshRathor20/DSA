package Array.Questions;

import java.util.Scanner;

class prefix {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //    static int[] prefixsum(int[] arr, int l, int r) {
//        int n = arr.length;
//        int[] pre = new int[n];
//        arr[0] = arr[0];
//        for (int i = 1; i < n; i++) {
//            arr[i] = arr[i - 1] + arr[i];
//        }
//        return arr;
//    }
    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        arr[0] = arr[0];
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

//    static int rangeSum(int[] pre, int l, int r) {
//        if (l == 0) return pre[r];
//        return pre[r] - pre[l - 1];
//    }


    static int querySum(int[] arr, int l, int r) {         //  Brute-force approach
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    static int findArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean equalSumPartitionSum(int[] arr) {
        int totalSum = findArraySum(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }

}

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 1, 3, 6};
        prefix p = new prefix();
//        p.prefixsum(arr, 1, 3);
        p.prefixSum(arr);

        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter range :");
            int l = sc.nextInt();
            int r = sc.nextInt();
//            int[] ans=prefixsum[r]-prefixsum[r-1];
//            System.out.println("Sum from " + l + " to " + r + " = " + p.rangeSum(arr, l, r));
            q--;
        }
        System.out.println("Brute-force Query Sum: " + p.querySum(arr, 1, 3));

        System.out.println("equal Sum Partition Sum :" + p.equalSumPartitionSum(arr));
    }
}
