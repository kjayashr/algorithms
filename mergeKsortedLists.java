class Solution {
      public ListNode mergeKLists(ListNode[] lists) {
          if (lists == null || lists.length == 0) return null;
          PriorityQueue < ListNode > heap = new PriorityQueue < ListNode > (lists.length, new Comparator < ListNode > () {
           @Override
           public int compare(ListNode l1, ListNode l2) {
            return Integer.compare(l1.val, l2.val);
           }
          });

      for(ListNode node:lists)
      {
          while(node!=null)
          {heap.add(node);node = node.next;}
      }
          ListNode temp = new ListNode(0);
          ListNode head = temp;
    while(!heap.isEmpty())
    {
        ListNode tempNode = heap.poll();
        ListNode newNode = new ListNode(tempNode.val);
        temp.next = newNode;
        temp = temp.next;
    }
return head.next;
