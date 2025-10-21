package loops;
 import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int next = a + b;
        for (int i = 3; i <= n; i++)
            System.out.println(next);
    }
}