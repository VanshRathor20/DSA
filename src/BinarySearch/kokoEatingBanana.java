package BinarySearch;

public class kokoEatingBanana {

    public static int findMax(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    public static long calculateTotalHours(int[] piles, int hourly) {
        long totalH = 0;

        for (int i = 0; i < piles.length; i++) {
            totalH += (piles[i] + hourly - 1) / hourly;
        }

        return totalH;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalH = calculateTotalHours(piles, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        System.out.println(minEatingSpeed(arr,8));
    }
}