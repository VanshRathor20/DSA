package Backtracking;

import Recursion.Basic_recursion.printLinear1toN;

public class print1toN {
    public static void a(int n,int cnt){
        if(cnt<0) return;
        a(n,cnt-1);
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        print1toN sol = new print1toN();
        int n = 10;

        sol.a(n,n);
        System.out.println();
    }

}
