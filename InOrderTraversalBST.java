class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
          Stack<TreeNode> stack = new Stack<TreeNode>();
          List<Integer> res = new ArrayList();
           TreeNode current = root;
        while(current!=null || !stack.isEmpty())
        {
            while(current!=null)
            {
               
                stack.push(current);
                 current = current.left;
            }
            
            current = stack.pop();
            res.add(current.val);
            current = current.right;
        }
        
        return res;
    }
}
//Ls 7th July 2020
