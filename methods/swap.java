package Methods;
import java.util.Scanner;
public class swap {
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no: ");
        int a= sc.nextInt();
        System.out.print("enter 2nd no: ");
        int b= sc.nextInt();
        swap(a,b);
//        int temp = a;
//        a=b;
//        b=temp;
        System.out.println("After swapped a= "+a);
        System.out.println("After swapped b= "+b);

    }
}
