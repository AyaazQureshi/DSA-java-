package arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        // shallow copy...
        int[] nums = arr;
        nums[0]=70;
        System.out.println(arr[0]);
        for(int ele : nums){
            System.out.print(ele+" ");
        }
        System.out.println();
        //deep copy method1..(built in function se)
//        int[] brr = Arrays.copyOf(arr,arr.length);
//        brr[0]=70;
//        System.out.println(arr[0]);
//        for(int ele : brr){
//            System.out.print(ele+" ");
//        }
        // deep copy method 2.....
//        int[] crr = new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            crr[i]=arr[i];
//        }
//      for(int i=0;i<crr.length;i++){
//          System.out.print(crr[i]+" ");
//      }
    }
}
