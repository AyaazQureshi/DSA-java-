package arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81};
        int[] c = new int[a.length+b.length];
        int i=0,j=0,k=0;
        //Merging..
        // method1...
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){// now take elements from b only..
            while(j<b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        else{ // j== b.length..
            while(i<a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }

        // method2...
//        int m = a.length;
//        int n = b.length;
//        int [] c= new int[m+n];
//        int i=m-1,j=n-1,k=m+n-1;
//        while( i>=0 && j>=0){
//            if(a[i]>b[j]){
//                c[k]=a[i];
//                k--;
//                i--;
//            }
//            else{  // b[j] > a[i]
//               c[k] = b[j];
//               k--;
//               j--;
//            }
//        }
//        if(i<0){
//            while(j>=0){
//               c[k] = b[j];
//               k--;
//               j--;
//            }
//        }
//        else{
//            while(i>=0){
//               c[k] = a[i];
//                k--;
//                i--;
//            }
//        }
      for(int ele: c){
          System.out.print(ele+" ");
      }

    }
}
