package arrays;

public class DutchFlagAlgo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        // method1 .. two pass solution..
//        int noOfZereos=0;
//        int noOfOnes=0;
//
//        for(int i=0;i<n;i++){
//            if(arr[i]==0) noOfZereos++;
//            if (arr[i]==1) noOfOnes++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<noOfZereos) arr[i]=0;
//          else  if(i<(noOfZereos+noOfOnes)) arr[i]=1;
//            else  arr[i]=2;
//        }
      // method2..one pass solution(dutch flag algo)
        int lo = 0;
        int mid = 0;
        int hi = n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++; mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                int temp =arr[mid];
                arr[mid] = arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
       for(int ele: arr){
           System.out.print(ele+" ");
       }

    }
}
