package Recursion.Basic_recursion;

public class Factorial {
    //brute
    public static int brute(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial sol=new Factorial();
        System.out.println(sol.brute(5));
    }

}
