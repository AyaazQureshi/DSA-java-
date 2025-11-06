package arrays;

import java.util.Arrays;

public class arraysOf0sand1s {
    public static void main(String[] args) {
        int [] arr = {0,1,0,0,1,1};
        //Arrays.sort(arr);
        int n = arr.length;
//        int noOfZeroes = 0;
//        for(int i=0;i<n;i++){
//            if (arr[i]==0) noOfZeroes++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<noOfZeroes) arr[i] = 0;
//            else arr[i] = 1;
//        }

        // method2 1 pass soln...
        int i=0;
        int j=n-1;
        while(i<j){
            if (arr[i]==0) i++;
            else if(arr[j]==1) j--;
           else if(arr[i]==1 && arr[j]==0){
              arr[i]=0;
              arr[i]=1;
                i++;
                j--;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
