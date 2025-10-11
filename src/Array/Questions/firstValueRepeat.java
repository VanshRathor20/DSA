package Array.Questions;

class firstValue {
    public static int FIRSTVALUEREPEAT(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
//                    ans=arr[i];
                    return arr[i]; // Return the first value that repeats
                }

            }
        }
        return -1;  // No repeating element found
    }
}

public class firstValueRepeat {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 6, 3, 4};
        firstValue fv = new firstValue();
        System.out.println("First value that is repested :" + fv.FIRSTVALUEREPEAT(arr));
        System.out.println("First value that is repested :" + fv.FIRSTVALUEREPEAT(arr));
    }
}
