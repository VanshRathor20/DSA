package Recursion.Basic_recursion;

public class IsPalindrome {
    public static boolean isPalindrome(String s){
        return check(s,0,s.length()-1);
    }
    private static boolean check(String s,int left, int right){
        if(left>=right) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
        return check(s,left+1,right-1);
    }

    public static void main(String[] args) {
        IsPalindrome sol= new IsPalindrome();
        String s="madam";
        System.out.println(sol.isPalindrome(s));
    }

}
