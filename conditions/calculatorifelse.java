package conditionals;
import java.util.Scanner;
public class calculatorifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no: ");
        int a =sc.nextInt();
        System.out.println("enter 2nd no: ");
        int b = sc.nextInt();
        System.out.println("enter a character: ");
        char op = sc.next().charAt(0);

        if (op == '+') System.out.println(a+b);
        if (op == '-') System.out.println(a-b);
        if (op == '*') System.out.println(a*b);
        if (op == '/') System.out.println(a/b);
        else System.out.println("invalid operator");
    }
}
