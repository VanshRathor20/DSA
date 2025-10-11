package Array.Questions;

import java.util.Scanner;

class present {
    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
}

public class numberIsPresentInArrayorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {11, 22, 33, 44, 23, 5, 678, 54};
        int[] freq = present.makeFrequencyArray(arr);

        System.out.println("Enter number of queries :");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter number to be searched :");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            q--;
        }
    }
}
