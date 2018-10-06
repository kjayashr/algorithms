class Solution {
    public boolean isPalindrome(ListNode head) {
     ListNode fast = head;
     ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;   
        }
        if(fast != null)
        {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while( slow != null)
        {
            if(slow.val != fast.val)
                return false;
            else
                slow = slow.next;
                fast = fast.next;
        }
        return true;
        
    }
    
    public static ListNode reverse(ListNode head)
    {
        
        ListNode current = head;
        ListNode prev = null;
        while(current!=null)
        {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        
        return prev;
    }
    
    
}
