class Solution {
    public int[] productExceptSelf(int[] nums) {
     int left = 1;
        int[] res = new int[nums.length];
        res[0] = left;
        for(int i = 1; i<nums.length;i++ )
        {
            res[i] = left*nums[i-1];
            left = res[i];
        }
        
       int right = nums[nums.length-1];
        for(int i = nums.length-2; i>=0;i-- )
        {
            res[i] = right*res[i];
            right = right*nums[i];
        }
        return res;
    }
}
