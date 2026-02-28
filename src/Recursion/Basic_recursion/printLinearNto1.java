package Recursion.Basic_recursion;

public class printLinearNto1 {
    public static void printnto1(int n,int cnt){
        if(cnt==0) return ;
        System.out.println(cnt);
        printnto1(n,cnt-1);
    }

    public static void main(String[] args) {
        printLinearNto1 sol = new printLinearNto1();
        int n = 10;

        sol.printnto1(n,n);
        System.out.println();
    }

}
