class Solution {
    /*hay stack and needle. Using Substring and equals function:

Input: haystack = "hello", needle = "ll" Output: 2
*/
    
    public int strStr(String haystack, String needle) {
      if(haystack.equals(needle)) return 0;
      int l1 = haystack.length();
      int l2 = needle.length();
      if(l2>l1)
      {
          return -1;
          
      }
        
        for(int i = 0;i<=l1-l2;i++)
            
        {
            if(haystack.substring(i,i+l2).equals(needle)) { 
             System.out.println(haystack.substring(i,i+l2));
             return i;}
        }
        
      return -1;
    }
}
