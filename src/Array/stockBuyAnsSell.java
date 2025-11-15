package Array;

public class stockBuyAnsSell {
    //brute
    public static int maximumProfit(int[] arr) {
        int mini = arr[0];
        int profit = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println("brute :"+maximumProfit(arr));
    }

}
