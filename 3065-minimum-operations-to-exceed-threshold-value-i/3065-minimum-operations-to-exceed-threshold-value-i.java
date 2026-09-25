class Solution {
    public int minOperations(int[] arr, int k) {
        int n = arr.length;
        // base case  agar sb k se badhe hue toh return 0 
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(arr[i]<k) {
                flag=false;break;
            } 
        }
        if(flag==true) return 0;

        int c=0;
        for(int x=1;x<=n;x++){
            int mn = Integer.MAX_VALUE;int mindx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]<mn && arr[i]!=0){
               mn = arr[i];
               mindx=i;
              
            } 
        }
         c++;
           arr[mindx]=0;
           boolean flag2=true;
           for(int j=0;j<n;j++){
              if(arr[j]<k && arr[j]!=0){
                flag2=false;
                break;
              }
           }
           if(flag2==true) return c;
        }
        return c;
    }
}