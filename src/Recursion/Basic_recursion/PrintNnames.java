package Recursion.Basic_recursion;

public class PrintNnames {
    public static void printName(String name,int n,int cnt){

        if(cnt>n){
            return ;
        }
        System.out.println(name);
        printName(name,n,cnt++);
    }
    public static void main(String[] args) {
        PrintNnames sol = new PrintNnames();
        String name="vansh";
        sol.printName(name, 3,0);
    }
}
