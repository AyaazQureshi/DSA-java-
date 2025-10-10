package conditionals;
import java.util.Scanner;
public class divisibleby5butnotby3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no: ");
        int n = sc.nextInt();
        if (n%5==0 && n%3!=0)
            System.out.println("divisible by 5 but not 3");
        else
            System.out.println("not divisible by 5");
    }
}
