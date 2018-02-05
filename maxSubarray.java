public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        
        int maxSoFar=A[0];
        int sum = 0;
        int maxEndingHere = A[0];
        for(int i = 1; i <= A.length-1; i++  )
        {
            maxEndingHere = maxEndingHere + A[i];
            maxEndingHere = Math.max(maxEndingHere,A[i]);
           maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        
        return maxSoFar;
    }
}
