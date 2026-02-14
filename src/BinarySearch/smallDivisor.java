package BinarySearch;

public class smallDivisor {
    public static int smallestDivisor(int[] nums, int threshold) {
        int max = findMax(nums);
        // Try every divisor from 1 to max
        for (int divisor = 1; divisor <= max; divisor++) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += (nums[i] + divisor - 1) / divisor;  // ceil division
                // Small optimization
                if (sum > threshold) {
                    break;
                }
            }
            if (sum <= threshold) {
                return divisor;
            }
        }
        return max;
    }

    public static int findMax(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(smallestDivisor(arr, 4));
//        System.out.println(smallestDivisorOptimal(arr, 4));
    }
}
