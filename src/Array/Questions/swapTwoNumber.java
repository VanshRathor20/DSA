package Array.Questions;

class twoNumber {
    static void swappingNumber(int a, int b) { // value swap using third variable
        System.out.println("Original values before swapping :");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
//        int c=a;
//        a=b;
//        b=c;

        // with using third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" values after swapping :");
        System.out.println("a :" + a);
        System.out.println("b :" + b);


    }
}

public class swapTwoNumber {
    public static void main(String[] args) {
        twoNumber tn = new twoNumber();
        twoNumber.swappingNumber(3, 4);
    }
}
