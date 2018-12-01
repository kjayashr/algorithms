/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     List<List<Integer>> answer = new ArrayList();
     compute(root,answer,0);
        return answer;
    }
    public void compute(TreeNode current,List<List<Integer>> ans, int level)
    {
        if(current == null)
            return;
        if(ans.size()==level)
            ans.add(new ArrayList<Integer>());
        if(level%2==0)
        ans.get(level).add(current.val);
        else
          ans.get(level).add(0,current.val);
        compute(current.left,ans,level+1);
        compute(current.right,ans,level+1);
        
    }
}
