class Solution {
    public String simplifyPath(String path) {
          Stack<String> stack = new Stack<String>();
        
          Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
          for ( String dir : path.split("/"))
          {
              if(dir.equals("..") && !stack.isEmpty())
              {
                  stack.pop();
              }
              else if(!skip.contains(dir))
                stack.push(dir);
          }     
        String res = "";
        //System.out.println(stack.pop());
        while(!stack.isEmpty())
        {
            res =  "/"+ stack.pop()+res;
        }
       
        return res.isEmpty() ? "/": res;
}
}

//duplicate
