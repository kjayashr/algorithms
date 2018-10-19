public class Solution {
public String reverseWords(String s)
{
 //start iterating from reverse
 if(s.isEmpty()) return "";
  StringBuilder res = new StringBuilder();
  int j = s.length();
  for(int i =s.length()-1;i >= 0;i--)
  {
   if(s.charAt(i)==' ')
  {
  j = i;
  }
  else if(i == 0 || s.charAt(i-1)==' ')
 {
   if(res.length()!=0)
   {
   res.append(' ');
   }
 res.append(s.substring(i,j));
      //System.out.println(res);
 }

}
    return res.toString();

}
