package Array;

import java.util.Arrays;

public class ThreeSum {
    public static int[] brute(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        return new int[] {arr[i],arr[j],arr[k]};
                    }
                }
            }
        }
        return new int[] {-1,-1,-1};
    }

    //optimal
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3)
            return result;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {

            // skip duplicates for i
            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        System.out.println(Arrays.toString(ThreeSum.brute(arr,0)));

    }

}
