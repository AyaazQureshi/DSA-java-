package loops;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld=0;
        int result=0;
        while(n!=0){
            if (n<0){
                ld = n % 10;
                System.out.print(ld);
                n=n/-10;
            }
            else{
            ld = n % 10;
            System.out.print(ld);
            n=n/10;
            }
        }

    }
}
