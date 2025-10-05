package basicsofjava;
 import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter english marks: ");
            double e = sc.nextDouble();
            System.out.println("enter maths marks: ");
            double m = sc.nextDouble();
            System.out.println("enter physics marks: ");
            double p = sc.nextDouble();
            System.out.println("enter chemistry marks: ");
            double c = sc.nextDouble();
            System.out.println("enter biology marks: ");
            double b = sc.nextDouble();
          double percentage =( e+m+p+c+b) / 5;
        System.out.println("your percentage is "+percentage);
    }
}
