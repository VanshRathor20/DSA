package DsaMaths1.java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MathsForDsa {
    public static void main(String[] args) {
//        reverseNumber(1234);
//        power(2,3);
//        powerExponentiation(2,2);
//        NoOfDigit(0);
//        armstrong(153);
        palindrome(121);

    }
    static void reverseNumber(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            res=res*10+rem;
            n/=10;
        }
        System.out.println("Reverse is "+res);
    }

    static double power(int base,int power){
        int res=1;
        for(int i=0;i<power;i++){
            res*=base;
        }
        System.out.println(res);
        return res;
    }

    static double powerExponentiation(int num,int power){
        double res=1;
        while(power>0){
            if(power!=2){
                res=res*num;
            }
            power=power/2;
            num*=num;
            System.out.println(res);
        }
        return res;
    }

    static void NoOfDigit(int n){
        int count=0;
        if(n==0){
            System.out.println("no of digit : 1");
            return;
        }
        while(n>0){
            n=n/10;
            count ++;
        }
        System.out.println("no of digit :"+count);
    }

    static void armstrong(int n){
        int temp=n;
        int res=1;
        int count =0;
        int result=0;

        while(n>0){
            int digit=n%10;
            res=res+(int)Math.pow(digit,3);
            n/=10;
        }

        // again processing
//        temp=n;
//        while(n>0){
//            int digit=n%10;
//            res=1;
//            for(int i=0;i<count;i++){
//                res=res*digit;
//            }
//            result += res;
//            temp/=10;
//
//        }


        if(temp==n){
            System.out.println(n+" is a armstring number ");
        }
        System.out.println(n+" is not a armstring number ");
    }

    static void palindrome(int n){
        int temp=n;
        int res=0;
        while (n>0){
            int digit=n%10;
            res=res*10+digit;
            n=n/10;
        }
        if(temp==res){
            System.out.println("yes");
            return;
        }
        System.out.println("No");
    }
}