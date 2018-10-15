class Solution {
    public int minAddToMakeValid(String S) {
      Stack<Character> stack = new Stack<Character>();
        int count = 0;
      for(int i = 0 ; i < S.length(); i++)
      {
          if(S.charAt(i) == '(')
              stack.push(')');
          else if(S.charAt(i) == '[')
              stack.push(']');
          else if(S.charAt(i)== '{')
              stack.push('}');
          else 
          {
            
            if(stack.isEmpty()) count ++;
          
                else if(!stack.isEmpty() && stack.pop() != S.charAt(i))
                count ++;         
              
          }
              
        
      }
        while(!stack.isEmpty())
        {
            stack.pop();
            count++;
        }
        
        return count; 
}
}
///
/*


*/



