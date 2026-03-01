package Recursion.Basic_recursion;

public class SumOfNno {
    //brute
    public static int brute(int[] arr){
        int sum=0,n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    // by using formula
    public static int formula(int[] arr){
        int n=arr.length;
//        int sum=0;
//        for(int i=0;i<=n;i++){
//            sum=n*(n+1)/2;
//        }
        return (n*(n+1)/2);
    }

    // by using recursive function
    public static int recursive(int n){
        if(n==0) return 0;
        return n+recursive(n-1);
    }
    public static void main(String[] args) {
        SumOfNno sol=new SumOfNno();
        int[] arr={1,2,3,4,5};
        System.out.println(sol.brute(arr));
        System.out.println(sol.formula(arr));
        System.out.println(sol.recursive(5));
    }
}


