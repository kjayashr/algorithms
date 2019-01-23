
/*
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
*/



class Solution {
    public int firstUniqChar(String s) {
        int[] dct = new int[26];
        char[] str = s.toCharArray(); 
       for(int i = 0; i<str.length; i++)
       {
           char c = str[i];
           int val = dct[c-'a'];
           dct[c-'a'] = val+1;
       }
        for(int i = 0; i<str.length; i++)
        {
            char c = str[i];
          if(dct[c-'a']==1)
              return i;
        }
      
        return -1;
    }
}
