package SlidingWindow;

public class SubStringContainingThreeChar {
    public static int brute(String s){
        int cnt=0, n=s.length();
        for(int i=0;i<n;i++){
            int[] hash=new int[3];
            for(int j=i;j<n;j++){
                hash[s.charAt(j)-'a']++;
                if(hash[0]>0 && hash[1]>0 && hash[2]>0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        SubStringContainingThreeChar sol=new SubStringContainingThreeChar();
        String s="bbacba";
        System.out.println(sol.brute(s));
    }
}
