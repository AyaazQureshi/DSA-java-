package Methods;
  import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println(" enter n: ");
        int n= sc.nextInt();
        System.out.println(" enter r: ");
        int r= sc.nextInt();
        int ncr= factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(ncr);
    }
    static int factorial(int x){
        int fact=1;
        for(int i=2;i<=x;i++){
            fact=fact*i;
        }
        return fact;
    }
}
