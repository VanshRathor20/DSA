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


    public static void main(String[] args) {

        System.out.println(brute(36));
    }

}
