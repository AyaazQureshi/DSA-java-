package conditionals;
import java.util.Scanner;
public class triangleornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side: ");
        int a = sc.nextInt();
        System.out.println("enter second side: ");
        int b = sc.nextInt();
        System.out.println("enter third side: ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b)
            System.out.println("triangle");
        else
            System.out.println("not triangle");
    }
}
