package String;

public class  RotateString {
    public static boolean solution(String s,String goal){
        if(s.length()!=goal.length()) return false;
        return (s+s).contains(goal);
    }

    public static void main(String[] args) {
        RotateString r=new RotateString();
        String s="abcde";
        String goal="cdeab";
        System.out.println(r.solution(s,goal));
    }
}
