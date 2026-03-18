package StackAndQueue;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> st;
    private int min;

    //constructor
    MinStack(){
        st=new Stack<>();
    }

    //push
    public void push(int val){
        if(st.isEmpty()){
            min=val;
            st.push(val);
            return;
        }else{
            if(val>min){
                st.push(val);
            }else{
                st.push(2*val-min);
                min=val;
            }
        }
    }

    //pop
    void pop(){
        if(st.isEmpty()) return ;
        else{
            int x=st.pop();
            if(x<min){
                min=2*min-x;

            }
        }
    }

    //Top
    int top(){
        if (st.isEmpty()) return -1;
        int topVal=st.peek();
        if(min<topVal){
            return topVal;
        }
        return min;
    }

    //get mini
    public int getMin() {
        return min;
    }


        public static void main(String[] args) {
            MinStack s = new MinStack();

            // Function calls
            s.push(-2);
            s.push(0);
            s.push(-3);
            System.out.print(s.getMin() + " ");
            s.pop();
            System.out.print(s.top() + " ");
            s.pop();
            System.out.print(s.getMin());
        }


}
