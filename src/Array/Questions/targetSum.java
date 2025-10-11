package Array.Questions;


class practice {
    static int sum(int[] arr, int target) {
        int ans = 0;
//        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static int tripletSum(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                     }
                }
            }
        }
        return ans;
    }
}

public class targetSum {
    public static void main(String[] args) {
        practice p = new practice();
        int[] arr = {1,4,5,6,3} ;
//        System.out.println("ans is :" + p.sum(arr, 7));
        System.out.println("ans is :" + p.tripletSum(arr, 12));
    }
}
