package loops;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter which table u want: ");
        int n = sc.nextInt();
        for (int i=n;i<=n*10;i=i+n){
            System.out.println(i);
        }
    }
}
