/*Input: a = "11", b = "1"
Output: "100" */

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        int sum = 0;
        while(i>=0 || j>=0)
        {
            sum = carry;
            if(i>=0)
            {
                sum += a.charAt(i--) - '0';
                
            }
            if(j>=0)
            {
              sum += b.charAt(j--) - '0' ;  
            }
            res.append(sum%2);
            carry = sum/2;
        }
      if(carry!=0)
      {
        res.append(carry);
      }
   return res.reverse().toString();
    }
}
/*lasteseen:01/02/2019*/
