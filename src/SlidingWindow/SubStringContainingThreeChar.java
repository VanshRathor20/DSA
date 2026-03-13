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

    //optimal
    public static int optimal(String s){
        int l=0,r=0,n=s.length(),cnt=0;
        int[] hash=new int[3];
        while(r<n){
            hash[s.charAt(r)-'a']++;
            while(hash[0]>0 && hash[1]>0 && hash[2]>0){
                cnt=cnt+(n-r);
                hash[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        SubStringContainingThreeChar sol=new SubStringContainingThreeChar();
        String s="bbacba";
        System.out.println(sol.brute(s));
        System.out.println(sol.optimal(s));
    }
}
