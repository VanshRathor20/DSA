package String;

public class LongestCommonPrefix {
    public static String solution(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while(i<first.length() && i<last.length()){
            if (first.charAt(i)!= last.charAt(i)){
                break;
            }
            i++;
        }
        return first.substring(0,i);
    }
    public static void main(String[] args) {
        LongestCommonPrefix l=new LongestCommonPrefix();
        String[] s={"flower","flow","fly"};
        System.out.println(l.solution(s));
    }
}
