/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public boolean isBalanced(TreeNode root) {
        
//     }
// }

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode A) {
      if(A == null)
      {
          return true;
      }
      
        
            int leftH  = maxDepth(A.left);
            int rightH = maxDepth(A.right);
            
        if((Math.abs( leftH - rightH )  <= 1) && (isBalanced(A.left)) &&  (isBalanced(A.right))) {
            return true;
        }
        else
        {
            return false;
        }
      
        
   
    }
    
    

        public int maxDepth(TreeNode root) {
if (root == null) return 0;
return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
}


    
}

