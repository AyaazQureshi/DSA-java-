class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
       
        int[] arr = new int[n];
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1') arr[x]++;
            }
            x++;
        }
        // 3 0 2 1 
        int ans=0;
        int prev=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                ans += prev * arr[i];
                prev = arr[i];
            }
        }
        return ans;
    }
}