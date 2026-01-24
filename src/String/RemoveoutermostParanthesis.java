import java.util.*;

public class RemoveoutermostParanthesis {
    public String removeOuter(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == ')') count--;

            if (count > 0) {
                ans.append(ch);
            }

            if (ch == '(') count++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        RemoveoutermostParanthesis r=new RemoveoutermostParanthesis();
        String s="(()())";
        System.out.println(r.removeOuter(s));
    }
}
