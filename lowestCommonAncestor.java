class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ( root == null)
            return root;
        else if (root == p || root == q )
        {
            return root;
        }
        
        TreeNode left = lowestCommonAncestor(root.left,  p,  q);  
        TreeNode right = lowestCommonAncestor(root.right,  p,  q);
        return (left!=null && right != null) ? root : (left == null) ? right : left; 
    }
}