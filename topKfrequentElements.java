//Though this is not optimal solution.

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length;i++ )
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<Map.Entry<Integer, Integer>>(k, new Comparator<Map.Entry<Integer, Integer>>(){
           @Override
            public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b)
            {
                if (a.getValue() > b.getValue())
                 return -1;
                else if (a.getValue() < b.getValue())
                    return 1;
                else return 0;
            }
        });
         for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        
          while(res.size()<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        
        return res;
    }
}
