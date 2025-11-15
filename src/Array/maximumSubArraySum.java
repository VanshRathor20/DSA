package Array;

public class maximumSubArraySum {
    //brute
    public static int brute(int[] arr){
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++) {
                sum += arr[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    //optimal   kanade algorithm
    public static int optimal(int[] arr){
            int n=arr.length;
            int sum=0;
            int maxi=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                sum+=arr[i];

                maxi = Math.max(maxi, sum);
                if(sum<0){
                    sum=0;
                }
            }
            return maxi;
    }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("brute :"+ brute(arr));
        System.out.println("optimal :"+ optimal(arr));
    }
}
