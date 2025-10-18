package loops;

//package loops;
//import java.util.Scanner;
//public class ap {
//
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//        System.out.println("enter the terms");
//        int n = sc.nextInt();
//        for (int i=1;i<=2*n-1;i=i+2){
//            System.out.println(i);
//        }
//    }
//}
// >>> 4,7,10,13,16
//package loops;
//import java.util.Scanner;
//public class ap {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the terms");
//        int n = sc.nextInt();
//        for (int i=4;i<=3*n+1;i=i+3){
//            System.out.println(i);
//        }
//    }
//}

///method 2..without formula..


import java.util.Scanner;
public class ap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the terms");
        int n = sc.nextInt();
       int a = 4;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a=a+3;
        }
    }
}


