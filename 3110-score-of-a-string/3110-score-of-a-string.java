class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int n = s.length();
       int i=0;
       while(i<n-1){
        char ch = s.charAt(i);
        char dh = s.charAt(i+1);
        sum+=Math.abs((int)ch-(int)dh);
        i++;
       }
       return sum;
    }
}