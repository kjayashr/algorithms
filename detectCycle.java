public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
       
        while( slow!=null &&fast!=null && fast.next!=null)
         {
            fast =fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                fast = head;
                while(fast != slow)
                {
                    fast = fast.next;
                    slow = slow.next;
                    
                }
            return fast;    
            }
         }
     return null;
    }
}
//ls 01/02
