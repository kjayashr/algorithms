class Solution {

 public String longestPalindrome(String s) {
  if (s == null || s.length() < 1) return "";
  int start = 0;
  int end = 0;
   int len =0;
   for (int i = 0; i < s.length(); i++) {
    int len1 = expandaroundcenter(s, i, i);
    int len2 = expandaroundcenter(s, i, i + 1);
     len = Math.max(len1, len2);
    if (len >  end-start) {
     start = i - (len - 1) / 2;
     end = i + len / 2;
    }

   }
   //System.out.println("Start: "+ start+ "End : "+end +" Len"+len);
  return s.substring(start, end + 1);
 }
    
    
public int expandaroundcenter(String s, int left , int right)
{
    int L = left, R = right;
    while(L >= 0 && R < s.length() &&  s.charAt(L) == s.charAt(R))
    {
        L--;
        R++;
    }
    return R-L-1;
}
    

}
