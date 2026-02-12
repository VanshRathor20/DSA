package BinarySearch;

public class squareRoot {
    public static int brute(int n){
        int ans=1;
        for(int i=1;i<n;i++){
            if(i*i<=n){
                ans=i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static int sqrt(int n){
        int low=1, high=n,ans=1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(36));
        System.out.println(brute(36));
    }

}
