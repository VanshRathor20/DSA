package linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4,3,1, 5, 3};

        linearsearch(arr, 3,false); //give first occurence
        linearsearch(arr, 1,true); // give last occurence
    }

    public static void linearsearch(int[] arr, int key,boolean findLast) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                ans = i;
                if(findLast==false){
                    break;
                }
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at :" + ans);
        }
    }
}
