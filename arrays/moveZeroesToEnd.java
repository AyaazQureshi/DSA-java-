package arrays;

public class moveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1};
        int n = arr.length;
      int noOfZeroes =0 , noOfOnes=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0)  noOfZeroes++;
            else noOfOnes++;
        }
        for (int i = 0; i < n; i++) {
            if(i<noOfOnes) arr[i] = 1;
            else arr[i] =0;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
 // optomal solution in sorting concepts