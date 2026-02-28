package Recursion.Basic_recursion;

public class printLinear1toN {
    public static void print1toN(int n,int cnt){
        if(cnt>n){
            return;
        }
        System.out.println(cnt);
        print1toN(n,cnt+1);
    }

    public static void main(String[] args) {
        printLinear1toN sol = new printLinear1toN();
        int n = 10;

        sol.print1toN(n,0);
        System.out.println();
    }
}
