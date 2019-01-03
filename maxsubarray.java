class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar  = 0;
        int currmax = 0;
        for(int i =0;i<nums.length;i++)
        {
            currmax = Math.max(nums[i],currmax+nums[i]);
            maxsofar = Math.max(currmax,maxsofar);
        }
        return maxsofar;
    }
}
/*
Sum of Maximum subarray
*/
//01/03
