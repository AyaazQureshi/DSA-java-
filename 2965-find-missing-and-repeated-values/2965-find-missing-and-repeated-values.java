class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        // 13
        // 22
        int m = arr.length;
        int n = arr[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        int[] f = new int[2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              ans.add(arr[i][j]);
            }
        }
        Collections.sort(ans);
        // repeated...
        for(int i=1;i<ans.size();i++){
            if(ans.get(i).equals(ans.get(i-1))){
                f[0] = ans.get(i);
                ans.set(i,-1);
                break;
            }
        }
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==-1) {
                ans.remove(i);
                break;
            }
        }

       
        // missing
        
            
            for(int i = 0; i < ans.size(); i++) {
                if(ans.get(i) != i + 1) {
                    f[1] = i + 1;
                    break;
                }
            }
        
        


         if(f[1]==0) f[1]=n*n;
        return f;
    }
}