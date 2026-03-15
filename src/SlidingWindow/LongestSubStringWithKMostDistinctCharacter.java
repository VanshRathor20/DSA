package SlidingWindow;

import java.util.HashMap;

public class LongestSubStringWithKMostDistinctCharacter {
    public static int brute(String s,int k){
        int maxLen=0,n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(map.size()>k){
                    break;
                }
                maxLen=Math.max(maxLen,(j-i+1));
            }
        }
        return maxLen;
    }

    //optimal
    public static int optimal(String s,int k){
        int l=0,r=0,maxLen=0,n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()==0 || k==0) return 0;
        while(r<n){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            maxLen=Math.max(maxLen,(r-l+1));
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LongestSubStringWithKMostDistinctCharacter sol =new LongestSubStringWithKMostDistinctCharacter();
        String s="eceba";
        System.out.println(sol.brute(s,2));
        System.out.println(sol.optimal(s,2));
    }
}
