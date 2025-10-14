package conditionals;
 import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        int l = sc.nextInt();
        System.out.println("enter breadth: ");
        int b = sc.nextInt();
        int a = l * b;
        int p = (2*l) + (2*b);
        if (a > p) System.out.println("yes area is greater than perimeter ");
        else System.out.println("no area is not greater than perimeter");

    }
}
