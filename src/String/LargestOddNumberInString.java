package String;

public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        int  indx=-1;
        int i;
        for( i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                indx=i;
                break;
            }
        }
        if(indx==-1) return "";

        return num.substring(0,indx+1);
    }

    public static void main(String[] args) {
        LargestOddNumberInString l=new LargestOddNumberInString();
        String s="45 5 3 ";
        System.out.println(l.largestOddNumber(s));
    }
}
