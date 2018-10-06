class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        ListNode tail = head;
        int n = 1;
            while (tail.next != null) {
                     ++n ;
                     tail = tail .next ;
                    }
        k = k%n; //if the length of k is larger, we are just doing the mod and reducing cycles.
       if(k==0) return head;
       int stepsToNewHead = n - k;
        tail.next = head;
        //making the list as cycle.
        ListNode newTail = tail;
        while (stepsToNewHead-- > 0) {
        newTail = newTail .next ; }
        
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;

    

    }
}
