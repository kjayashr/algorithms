/*
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 /**
 *Level Order Traversal Java
 **/
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
     List<List<Integer>> answer = new ArrayList();
     compute(root,answer,0);
        return answer;
    }
    public void compute(TreeNode current,List<List<Integer>> ans, int level)
    {
        if(current == null)
            return;
        if(ans.size()==level)
            ans.add(0,new ArrayList<Integer>());
        
        ans.get(ans.size()-level-1).add(current.val);
        
        compute(current.left,ans,level+1);
        compute(current.right,ans,level+1);
        
    }
}
