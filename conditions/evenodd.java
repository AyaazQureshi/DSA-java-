package conditionals;
 import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive number: ");
        int n = sc.nextInt();
        if(n % 2 ==0)
            System.out.print("it is even number");
            else
            System.out.print("it is an odd number");

    }
}
