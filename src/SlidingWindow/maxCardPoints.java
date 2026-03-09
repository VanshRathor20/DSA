package SlidingWindow;

public class maxCardPoints {
    public static int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0,rsum=0,maxSum=0,rIndex=n-1;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];

        }
        maxSum=lsum;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[rIndex];
            rIndex--;
            maxSum=Math.max(maxSum,rsum+lsum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        maxCardPoints sol =new maxCardPoints();
        int[] arr={1,2,3,4,5,6,1};
        System.out.println(sol.maxScore(arr,3));
    }
}
