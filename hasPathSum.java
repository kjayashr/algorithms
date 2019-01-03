    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if((root.left == null) && (root.right == null) && (sum-root.val) == 0)
        {
            return true;
        }
       return (hasPathSum(root.right, sum-root.val) || hasPathSum(root.left, sum-root.val)) ;
        
    }
//01/03
