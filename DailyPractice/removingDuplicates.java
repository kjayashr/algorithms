class Solution {
    public int removeDuplicates(int[] nums) {
        int fp = 1, sp =0 ; int current =0;
        if(nums == null)
            return -1;
        if(nums.length==1)
            return 1;
        
        while(fp < nums.length)
        {
          while(fp < nums.length && nums[sp]==nums[fp])
          {
              fp++;
          }
         
            if(fp < nums.length)
            {
                current++;
           nums[current] = nums[fp];
            sp = fp;
            fp ++;
            }
        }
        return current+1;
    }
}
