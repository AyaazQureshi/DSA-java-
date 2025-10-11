package conditionals;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks: ");
        int x = sc.nextInt();
        if(x>80) System.out.println("very good");
        else if (x>60) System.out.println("good");
        else if (x>40) System.out.println("average");
        else System.out.println("sorry, u r fail");
    }
}
