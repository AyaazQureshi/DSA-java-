package arrays;
import java.util.Scanner;
public class RotateArrayByKsteps {
    public static void reverse(int[] a,int i,int j){
        while(i<=j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50, 60, 70};
        int n = a.length;
        int k = 3;
        k = k % n;
        reverse(a, 0, n - k - 1);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);

        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }
}
