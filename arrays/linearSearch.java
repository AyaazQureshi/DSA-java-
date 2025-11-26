package arrays;
 import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("enter element u want to search");
        int x = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<=n-1;i++){
            if(arr[i]==x){
            flag=true;
            }
        }
        if(flag==true)
            System.out.print("element found");
            else
            System.out.print("element not found");

    }
}
