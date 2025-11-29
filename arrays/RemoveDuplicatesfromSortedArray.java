package arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        int n = nums.length;
         int [] arr = new int[2];

        for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i] == nums[j]){
                        arr[i] = nums[i];
                    }
                }
        }
       
        for(int ele: arr){
            System.out.print(ele+" ");
        }


    }
}
