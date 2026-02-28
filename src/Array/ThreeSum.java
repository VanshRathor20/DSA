package Array;

import java.util.*;

public class ThreeSum {

    // ------------------ BRUTE FORCE ------------------
    // Time Complexity: O(n^3)
    public static List<List<Integer>> brute(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp);  // to avoid duplicate triplets
                        set.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }


    // ------------------ OPTIMAL (Two Pointer) ------------------
    // Time Complexity: O(n^2)
    public static List<List<Integer>> optimal(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3)
            return result;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }


    // ------------------ MAIN ------------------
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        System.out.println("Brute Force Output: " + brute(arr, 0));
        System.out.println("Optimal Output: " + optimal(arr));
    }
}