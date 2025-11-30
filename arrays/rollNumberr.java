package arrays;
 import java.util.Scanner;
public class rollNumberr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        int x=arr.length; // lengthofArray...
        System.out.println(x);
        for(int i=0;i<=n-1;i++){
            if (arr[i]<35)
                System.out.print(i+" ");
        }

    }
}
