public class Solution {
    public int[] twoSum(int[] nums, int target) {
     
     HashMap<Integer,Integer> hm= new HashMap();
     
     for ( int i = 0; i< nums.length; i++)
     {
         Integer diff = (Integer)(target - nums[i]);
            if(hm.containsKey(diff)){
                int toReturn[] = {hm.get(diff), i};
                return toReturn;
            }
            hm.put(nums[i], i);
     }
         
      return null;
        
    }


/*Use hashmap */
