
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


    
}(TreeNode A) {
    
    //base case
      if(A == null)
      {
          return true;
      }
      
        //calculate length
            int leftH  = maxDepth(A.left);
            int rightH = maxDepth(A.right);
           //difference should be less than 1 and recursievly call balanced functions.
        if((Math.abs( leftH - rightH )  <= 1) && (isBalanced(A.left)) &&  (isBalanced(A.right))) {
            return true;
        }

        else
        {
            return false;
        }
      
        
   
    }
    
    
//this helper will be called by every helper function.
  public int maxDepth(TreeNode root) {
if (root == null) return 0;
return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
}

