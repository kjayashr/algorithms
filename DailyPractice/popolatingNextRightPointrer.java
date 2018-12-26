public class Solution {
    public void connect(TreeLinkNode root) {
        if(root ==null) return;
        TreeLinkNode previous;
        TreeLinkNode current;
        previous = root;
        while(previous.left!= null)
        {
            current = previous;
            while(current!=null){
            current.left.next = current.right;
            if(current.next!= null)
               current.right.next = current.next.left;
            current = current.next;
            }
            previous = previous.left;
        }
    }
}
