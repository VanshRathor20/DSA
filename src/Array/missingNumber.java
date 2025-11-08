package Array;

public class missingNumber {

    //brute force approach
    public static int findMissing(int[] arr){
        int n = arr.length + 1;  // The expected number of elements including the missing one
        for(int i = 1; i <= n; i++){  // Check for each number from 1 to n
            int flag = 0;
            for(int j = 0; j < n-1; j++){  // Scan entire array to check if i is present
                if(arr[j] == i){
                    flag = 1;  // Number found
                    break;
                }
            }
            if(flag == 0){  // Number not found, so it's missing
                return i;
            }
        }
        return -1;  // If no number is missing (should not happen if 1 to n range)
    }



    // better approach
    public static int miss(int[] arr){
        int n=arr.length;
        boolean[] hash=new boolean[n+1];
        for(int i=0;i<n;i++) {
            hash[arr[i]] = true;
        }
        for(int i=0;i<=n;i++){
            if(!hash[i]){
                return i;
            }
        }
        return -1;
    }



    //optimal solution
    public static int missingNumber(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int naturalSum=((n+1)*(n+2))/2;
        return naturalSum-sum;
    }


    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        System.out.println(findMissing(arr));
//        System.out.println(missingNumber(arr));
//        System.out.println(miss(arr));
    }
}
