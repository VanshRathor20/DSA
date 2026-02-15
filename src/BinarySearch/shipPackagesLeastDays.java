package BinarySearch;

public class shipPackagesLeastDays {
    private static int findMax(int[] weights){
        int max=weights[0];
        for(int i=0;i<weights.length;i++){
            if(weights[i]>max){
                max=weights[i];
            }
        }
        return max;
    }

    private static int findSum(int[] weights){
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        return sum;
    }
    private static int findDaysReguired(int[] weights, int capacity){
        int days=1, load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                days++;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int minCapacity=findMax(weights), maxCapacity=findSum(weights);
        for(int i=minCapacity;i<=maxCapacity;i++){
            int requiredDays=findDaysReguired(weights,i);
            if(requiredDays<=days){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(shipWithinDays(arr,5));
    }
}
