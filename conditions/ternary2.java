package conditionals;
 import java.util.Scanner;
public class ternary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        System.out.println((n%3==0 && n%5==0)? "divisible by 3 or 5": "not divisible by 3 or 5");
    }
}
