package SlidingWindow;

public class BinarySumArrayWithSum {
    public static int atMost(int[] arr,int goal){
        int n=arr.length,l=0,r=0,sum=0,cnt=0;
        while(r<n){
            sum+=arr[r];
            while(sum>goal){
                sum=sum-arr[l];
                l++;
            }
            cnt=cnt+(r-l+1);
            r++;
        }
        return cnt;
    }
    public static int better(int[] arr,int goal){
        return atMost(arr,goal)-atMost(arr,goal-1);
    }

    public static void main(String[] args) {
        BinarySumArrayWithSum sol=new BinarySumArrayWithSum();
        int[] arr={1,0,1,0,1};
        System.out.println(sol.better(arr,2));
    }
}
