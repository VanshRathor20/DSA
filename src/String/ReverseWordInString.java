package String;

public class ReverseWordInString {
    public static String solution(String s){
        StringBuilder ans = new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int j=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            ans.append(s.substring(i+1,j+1)).append(" ");
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordInString r=new ReverseWordInString();
        String s="Hello World";
        System.out.println(r.solution(s));

    }
}
