package loops;
 import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no: ");
        int n = sc.nextInt();
        int ld;
        while(n!=0){
            ld = n % 10;
            System.out.print(ld);
            n = n / 10;
        }
    }
}
