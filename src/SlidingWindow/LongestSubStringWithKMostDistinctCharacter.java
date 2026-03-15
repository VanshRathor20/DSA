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

    public static void main(String[] args) {
        LongestSubStringWithKMostDistinctCharacter sol =new LongestSubStringWithKMostDistinctCharacter();
        String s="eceba";
        System.out.println(sol.brute(s,2));
    }
}
