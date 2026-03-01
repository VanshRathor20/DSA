package Recursion.Basic_recursion;

public class FibonacciNumber {
    //brute recursion
    public int fib(int n) {
        if(n<=1) return n;
        int last=fib(n-1);
        int slast=fib(n-2);
        return last+slast;
    }
    // Most Optimal (Space Optimized) 🚀
    public static int optimal(int n){
        if(n<=1) return n;
        int last=1;
        int slast=0;
        for(int i=2;i<=n;i++){
            int curr=last+slast;
            slast=last;
            last=curr;
        }
        return slast;
    }
    public static void main(String[] args) {
        FibonacciNumber sol=new FibonacciNumber();
        System.out.println(sol.fib(5));
        System.out.println(sol.optimal(5));
    }
}
