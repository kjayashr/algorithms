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
        /*  while(node!=null)
          {heap.add(node);node = node.next;} 
          
          This is approach 1 where you just add a list to heap and then take it back.
          We are not taking the advantage of list is sorted.
          
          
          
          
          */
          if(node!=null)
              heap.add(node);
      }
          ListNode temp = new ListNode(0);
          ListNode head = temp;
    while(!heap.isEmpty())
    {
        temp.next = heap.poll();
        temp = temp.next;
        if(temp.next!=null)
        {
            heap.add(temp.next);
        }
    }
          
return head.next;
      } }       
      
