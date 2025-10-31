package Methods;
 import java.util.Scanner;
public class sum {
   static int sum (int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no:");
        int a= sc.nextInt();
        System.out.println("enter 2nd no:");
        int b= sc.nextInt();
        int r = sum(a,b);
        System.out.print("The sum is "+r);
    }
}
