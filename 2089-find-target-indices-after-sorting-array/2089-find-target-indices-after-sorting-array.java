class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        ArrayList<Integer> l = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                l.add(i);
            }
        }
        return l;
    }
}
// u can use bs chindi 