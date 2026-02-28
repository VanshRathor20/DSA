package Backtracking;

import Recursion.Basic_recursion.printLinearNto1;

public class printNto1 {
    public static void a(int n,int cnt){
        if(cnt==0) return;
        a(n,cnt-1);
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        printLinearNto1 sol = new printLinearNto1();
        int n = 10;

        sol.printnto1(n,n);
        System.out.println();
    }
}
