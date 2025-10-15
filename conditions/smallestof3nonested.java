package conditionals;

import java.util.Scanner;

public class smallestof3nonested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no: ");
        int a = sc.nextInt();
        System.out.println("enter 2nd no: ");
        int b = sc.nextInt();
        System.out.println("enter 3rd no: ");
        int c = sc.nextInt();
        if(a < b) {
            if (a < c) {
                System.out.println(a + "is smallest");
            } else
                System.out.println(c + "is smallest");
        }
        else {
            if (b < c)
                System.out.println(b + "is smallest");
            else
                System.out.println(c + "is smallest");
        }


    }
}


