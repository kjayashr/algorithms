
/*
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.
*/

class Solution {
    public int[] sortArrayByParityII(int[] A) {
      for(int i= 0,j=1;i<A.length;i=i+2)
      {
      while(A[j]%2=1 && j<A.length)
      {
      j = j+2;
      }
      if(A[i]%2==1)
      {
      int temp = A[i];
      A[i] = A[j];
      A[j] = temp;
      j = j+2;
      }
      
  }
return A;       
    }
}

/*

*/
