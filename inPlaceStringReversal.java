class Solution {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length);
   for (int i = 0, j = 0; j <= s.length; j++) {
      if (j == s.length || s[j] == ' ') {
         reverse(s, i, j);
         i = j + 1;
      } 
   }
    }
 public void reverse(char[ ]s, int Begin, int End)
    {
        int Mid = (End-Begin)/2;
        for(int i = 0; i<Mid;i++)
        {
          char temp = s[Begin];
          s[Begin] = s[End-1];
          s[End-1] = temp;
          Begin++;
          End--;

        }
        
    }

/*Works for sentence */
