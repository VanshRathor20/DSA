package StackAndQueue;

import java.util.Stack;

public class nextGreater2 {
    public static int[] brute(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = -1;
            for (int j = 1; j < arr.length; j++) {
                int indx = (i + j) % arr.length;
                if (arr[indx] > arr[i]) {
                    ans[i] = arr[indx];
                    break;
                }
            }
        }
        return ans;
    }

    //optimal
    public static int[] optimal(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans = new int[arr.length];
        int n=arr.length;
        for(int i=2*n-1;i>=0;i--){
            int num=arr[i% arr.length];
            while(!st.isEmpty() && st.peek()<=num){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()) ans[i]=-1;
                else ans[i]=st.peek();
            }

            st.push(num);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 7, 6, 0};

        // Creating instance of Solution
        nextGreater2 sol = new nextGreater2();

        // Call function
        int[] ans = sol.brute(arr);
        int[] ans2 = sol.optimal(arr);

        System.out.println("The next greater elements are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("The next greater elements are: ");
        for (int num : ans2) {
            System.out.print(num + " ");
        }
    }
}
