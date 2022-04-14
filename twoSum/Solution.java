class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ret = new int[2];
        
        for(int i = 0; i<nums.length; i++) {
            
            for(int z = nums.length-1; z>i; z--) {
                
                if(nums[i] + nums[z] == target) {
                    ret[0] = i;
                    ret[1] = z;
                    return ret;
                }
                
            }
            
        }
        return ret;
    }
}