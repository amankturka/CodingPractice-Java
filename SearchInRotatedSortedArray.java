class Solution {
    //use binary search logic
    
    public int search(int[] nums, int target) {
        int length = nums.length;
        int mid = nums.length/2;
        int index = -1;
        for(int i = 0;i<mid;i++){
            if(target == nums[i]){
                index = i;
            }
        }
        for(int i = mid;i<nums.length;i++){
            if(target == nums[i]){
                index = i;
            }
        }
        return index;
    }
}