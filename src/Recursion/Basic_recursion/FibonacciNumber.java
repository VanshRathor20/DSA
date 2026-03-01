package Recursion.Basic_recursion;

public class FibonacciNumber {
    //brute recursion
    public int fib(int n) {
        if(n<=1) return n;
        int last=fib(n-1);
        int slast=fib(n-2);
        return last+slast;
    }

    public static void main(String[] args) {
        FibonacciNumber sol=new FibonacciNumber();
        System.out.println(sol.fib(5));
    }
}
