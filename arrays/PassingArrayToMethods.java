package arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    private static void change(int[] x) {// x is reference variable...
        x[0]=90;
    }
}
