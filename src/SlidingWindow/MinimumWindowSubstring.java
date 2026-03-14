package SlidingWindow;
import java.util.HashMap;
public class MinimumWindowSubstring {
    public static String minWindow(String s,String t){
        int n=s.length(),m=t.length();
        int l=0,r=0,minLen=Integer.MAX_VALUE,cnt=0,sIndex=-1;
        if(s==null || t==null || n<m) return "";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while (r<n){
            if(map.containsKey(s.charAt(r))){
                if (map.get(s.charAt(r))>0){
                    cnt++;
                }
                map.put(s.charAt(r), map.get(s.charAt(r)) - 1);
            }
            while(cnt==m){
                if (r-l+1<minLen){
                    minLen=r-l+1;
                    sIndex=l;
                }
                if (map.containsKey(s.charAt(l))){
                    map.put(s.charAt(l), map.get(s.charAt(l)) + 1);
                    if (map.get(s.charAt(l)) > 0) {
                        cnt--;
                    }
                }
                l++;
            }
            r++;
        }
        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);
    }
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";

    }
}
