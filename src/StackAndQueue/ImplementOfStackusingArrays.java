package StackAndQueue;

import java.util.Arrays;
import java.util.List;

public class ImplementOfStackusingArrays {
    // implementation of stack using array
    int size;
    int[] st;
    int top;

    //constructor
    ImplementOfStackusingArrays(int size){
        this.size=size;
        st=new int[size];
        top=-1;
    }
    void push(int value){
        if(top>=size-1){
            System.out.println("stack is overflow");
            return;
        }
        top=top+1;
        st[top]=value;
    }
    int pop(){
        if(top==-1){
            System.out.println("stack is underflow");
            return -1;
        }
        top=top-1;
        return st[top];
    }
    int peek(){
         if(top==-1) {
            System.out.println("stack is underflow");
            return -1;
        }
        return st[top];
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void display(){
        isEmpty();
        for(int i=0;i<=top;i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ImplementOfStackusingArrays sol = new ImplementOfStackusingArrays(10);
        sol.push(1);
        sol.push(2);
        sol.push(4);
        sol.display();
        sol.pop();
        sol.peek();
        sol.display();
        System.out.println(sol.isEmpty());
        sol.display();
    }

}
