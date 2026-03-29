package Recursion.Adv_Recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {

        private void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
            if(ind==arr.length){
                if(target==0){
                    ans.add(new ArrayList<>(ds));

                }
                return ;
            }
            if(arr[ind]<=target){
                ds.add(arr[ind]);
                findCombination(ind,arr,target-arr[ind],ans,ds);
                ds.remove(ds.size()-1);

            }
            findCombination(ind+1,arr,target,ans,ds);
        }
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans=new ArrayList<>();
            findCombination(0,candidates,target,ans,new ArrayList<>());
            return ans;
        }

    public static void main(String[] args) {
        combinationSum obj = new combinationSum();
        int[] v = {2, 3, 6, 7};  // Candidate numbers
        int target = 7;  // Target sum

        // Get all combinations
        List<List<Integer>> ans = obj.combinationSum(v, target);

        // Output the combinations
        System.out.println("Combinations are: ");
        for (List<Integer> combination : ans) {
            for (int num : combination) {
                System.out.print(num + " ");  // Print each element of the combination
            }
            System.out.println();  // Print a newline after each combination
        }
    }
}
