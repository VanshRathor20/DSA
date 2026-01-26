package String;

public class Anagram {
    public static boolean solution(String s, String t){
        if(s.length()!=t.length()) return false;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }for(int i:freq){
            if(i!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram a=new Anagram();
        String s="geeks";
        String t="geeks";
        System.out.println(a.solution(s,t));
    }
}
