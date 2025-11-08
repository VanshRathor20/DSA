public class findSingle {

    // Brute Force Approach:
    public static int Findsingle(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1; // If no unique number found
    }

    // better
    public static int findSingleUsingHashArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        // Find maximum value in arr to size hash array
        for (int num : arr) {
            if (num > max) max = num;
        }

        int[] hash = new int[max + 1]; // Hash array to store frequency, initialized to 0

        // Fill frequency in hash array
        for (int num : arr) {
            hash[num]++;
        }

        // Find the element which appears once
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 1) {
                return i;
            }
        }
        return -1; // No unique element found
    }

    //optimal
    public static int findSingleOptimal(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }



    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("The number that appears once is: " + Findsingle(arr));
        System.out.println(findSingleUsingHashArray(arr));
        System.out.println(findSingleOptimal(arr));
    }
}
