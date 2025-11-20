package arrays;
 import java.util.Scanner;
public class InputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n= sc.nextInt();
       int []arr = new int[n];

       //input>>>>   use for loop
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        //output>>>>> use for loop
       for(int i=0;i<=n-1;i++){
           System.out.print(arr[i] + "  ");
       }
    }
}
