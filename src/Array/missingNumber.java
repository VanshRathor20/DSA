package Array;

public class missingNumber {

    //brute force approach
    public static int findMissing(int[] arr){
        int n=arr.length;
        int flag=0;
        for(int i=1;i<n;i++){
            for(int j=0;i<n-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
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
        int naturalSum=(n*(n+1))/2;
        return naturalSum-sum;
    }


    public static void main(String[] args) {
        int[] arr={1,2,4,5};
//        System.out.println(findMissing(arr));
//        System.out.println(missingNumber(arr));
        System.out.println(miss(arr));
    }
}
