package Array.Questions;

class manipulation {
    public static int ArrayManipultion(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

public class arrManipulation {
    public static void main(String[] args) {
        manipulation mani = new manipulation();
        int[] arr = {1, 2, 3, 4, 2, 3, 1};
        System.out.println("unique element is :" + mani.ArrayManipultion(arr));
    }
}
