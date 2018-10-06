    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode oddHead = head;
         ListNode oddList = oddHead;
        ListNode evenHead = head.next;
        ListNode evenList = evenHead;
        while(evenHead!=null &&  evenHead.next!=null )
        {
            oddHead.next = evenHead.next;
            oddHead = oddHead.next;
            evenHead.next = oddHead.next;
            evenHead = evenHead.next;
        }
        oddHead.next = evenList;
        return oddList;
    }
