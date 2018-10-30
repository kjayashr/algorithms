class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        for(int i =0;i< k ; i++) pq.add(nums[i]);
                
         for(int i =k;i< nums.length ; i++)
        {
             if(pq.peek()<nums[i])
             {
                 pq.poll();
                 pq.add(nums[i]);
             }
        }
        return pq.poll();
    }
}
 
/* The idea is to construct a min-heap of size ->k and insert first k elements of array into the heap. Then for each of the remaining element of the array (A[k..n-1]) if that element is more than the root of the heap, we replace the root with current element. We repeat this process till array is exhausted. Now we will be left with  largest elements of the array in the min-heap and k’th largest element will reside at the root of the min-heap.*/
