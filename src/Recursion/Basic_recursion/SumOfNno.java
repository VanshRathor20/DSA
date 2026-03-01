package Recursion.Basic_recursion;

public class SumOfNno {
    //brute
    public static int brute(int[] arr){
        int sum=0,n=arr.length;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfNno sol=new SumOfNno();
        int[] arr={1,2,3,4,5};
        System.out.println(sol.brute(arr));
    }
}


