package conditionals;
 import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price: ");
        int cp = sc.nextInt();
        System.out.println("enter selling price: ");
        int sp = sc.nextInt();
        if(sp>cp)
            System.out.println("profit is "+(sp-cp));
        else if(sp == cp)
            System.out.println("no profit no loss");
        else
            System.out.println("loss is "+(cp-sp));


    }
}
