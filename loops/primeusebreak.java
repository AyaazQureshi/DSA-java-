package loops;
import java.util.Scanner;
public class primeusebreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no: ");
        int n = sc.nextInt();

        int flag=0;
        for (int i =2;i<=n-1;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if (n==1) System.out.println("neither prime nor composite");
        else if(flag == 1)  System.out.println("it is  composite");
        else System.out.println("it is prime");


    }
}
