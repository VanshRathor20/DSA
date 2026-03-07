package SlidingWindow;

import java.util.HashMap;

public class FruitIntoBasket {
    public static int TotalFruitBrute(int[] fruits){
        int max=0,n=fruits.length;

        for(int i=0;i<n;i++){
            int cnt=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++){
                map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
                if(map.size()>2) break;
                cnt++;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }

    // better
    public static int better(int[] fruits){
        int l=0,r=0,n=fruits.length,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                map.put(fruits[l],map.getOrDefault(fruits[l],0)-1);
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        FruitIntoBasket sol=new FruitIntoBasket();
        int[] arr={3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(sol.TotalFruitBrute(arr));
        System.out.println(sol.better(arr));
    }
}