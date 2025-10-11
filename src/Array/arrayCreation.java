package Array;

class types {
    void singleArr() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 134;
        arr[2] = 231;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("length of singal array is " + arr.length);
    }

    void multiArr() {
        int[][] arr = new int[2][2];
        arr[0][0] = 23;
        arr[0][1] = 20;
        arr[1][0] = 67;
        arr[1][1] = 47;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

    }
}


class arrayExample {
    void demoArray() {
        int[] ages = new int[3];
        ages[0] = 11;
        ages[1] = 41;
        ages[2] = 21;
//        ages[5]= 32;           ArrayIndexOutOfBoundsException

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);


        // iterate using the for loop
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        // iterate using the for each loop
        for (int x : ages) {
            System.out.println(x);
        }

        // iterate using the while loop
        int i = 0;
        while (i < ages.length) {
            System.out.println(ages[i]);
            i++;
        }

    }
}

public class arrayCreation {
    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
        obj.demoArray();

        types t = new types();
//        t.singleArr();
//        t.multiArr();

    }
}
