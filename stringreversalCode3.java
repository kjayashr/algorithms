class Solution {
  
    public String reverseWords(String s)
    {
        StringBuilder sb = new StringBuilder();
        int i =0, j = 0;
        for(;j<s.length();j++)
        {
           
            if(j==s.length()-1 || s.charAt(j+1)==' ')
            {
                
                sb.append(reverse(s.substring(i,j+1))).append(' ');
                i =j+1;
                
            }
        }
     return sb.toString().trim();
    }
    
    public String reverse(String s)
    {
        int begin = 0, end = s.length(), mid = (end-begin)/2;
        char[] str = new char[s.length()];
        str = s.toCharArray();
        StringBuilder rev = new StringBuilder();
        for(int i = 0; i < mid ; i++)
        {   
            char temp = str[begin];
            str[begin] = str[end-1];
            str[end-1] = temp;
            begin++;
            end--;
        }
        
  for (int i = 0; i < str.length; i++) {
   rev.append(str[i]);
 }
        
        return rev.toString().trim();
    }
    
}

//02/01
