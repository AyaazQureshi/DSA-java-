package arrays;

//package Arrays;
//
//import java.util.Scanner;
//
//public class secondLargest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("enter array elements: ");
//        for(int i=1;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
////        int max = Integer.MIN_VALUE;
////        for(int i=0;i<n;i++) {
////            max= Math.max(max,arr[i]);
//        }
//
//        int smax = Integer.MIN_VALUE;
//        for(int i=0;i<=n-1;i++){
//            if(arr[i]!=max){
//                smax= Math.max(smax,arr[i]);
//            }
//        }
//        System.out.println(smax);
////        System.out.print("maximum element is " +max);
//
//    }
//}



import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            max= Math.max(max,arr[i]);
        }

        int smax = Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);


    }
}

