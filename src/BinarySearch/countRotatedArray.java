package BinarySearch;

public class countRotatedArray {
    public static int countRotations(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

        public static void main(String[] args) {
            int[] arr={4,5,1,2,3};
            System.out.println(countRotations(arr));
        }


}
