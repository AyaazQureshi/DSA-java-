package basicsofjava;
 import com.sun.jdi.PathSearchingVirtualMachine;

 import java.util.Scanner;
public class areaofcircleinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a radius: ");
        double r = sc.nextDouble();
        double a = 3.141592*r*r;
        System.out.println("the area of circle is : "+a);
    }
}
