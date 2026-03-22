package StackAndQueue;

import org.w3c.dom.css.CSSStyleDeclaration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] optimal(int[] arr){
        List<Integer> st=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
               st.add(arr[i]);
           }
           else{
               while(!st.isEmpty() && st.get(st.size()-1)>0 && st.get(st.size()-1)<Math.abs(arr[i])){
                   st.remove(st.size()-1);
               }
               if(!st.isEmpty() && st.get(st.size()-1)==Math.abs(arr[i])){
                   st.remove(st.size()-1);
               }
               else if(st.isEmpty() || st.get(st.size()-1)<0){
                   st.add(arr[i]);
               }
           }
        }

        int[] ans=new int[st.size()];
        for(int i=0;i<st.size();i++){
            ans[i]=st.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        AsteroidCollision sol=new AsteroidCollision();
        int[] arr={
                1,2,3,4,5,-1,-3,-4,7,-15,-6,24,55,0,-56,-34
        };
        System.out.println(Arrays.toString(sol.optimal(arr)));
    }

}
