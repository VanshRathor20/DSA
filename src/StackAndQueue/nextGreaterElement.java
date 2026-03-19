package StackAndQueue;

import java.util.Stack;

public class nextGreaterElement {
    public static int[] greater(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] temp=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while (!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) temp[i]=-1;
            else temp[i]=st.peek();
            st.push(arr[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10};
        nextGreaterElement sol = new nextGreaterElement();
        int[] ans = sol.greater(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}
