package Methods;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no: ");
        int n = sc.nextInt();
        int r= factorial(n);
        System.out.println(r);
    }
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        return fact;
    }
}
