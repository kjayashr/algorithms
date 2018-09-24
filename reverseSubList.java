class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    if(head == null) return null;
     
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        int counter = 0;
        while(counter< m-1)
        {
            counter++;
            prev = prev.next;
        }
        ListNode start = prev.next;
        ListNode then = start.next;
        while( counter  < n-1)
        {
          start.next=then.next;
          then.next = prev.next;
          prev.next = then;
          then = start.next; 
            counter++;
        }
        return dummy.next;
    } 
}
