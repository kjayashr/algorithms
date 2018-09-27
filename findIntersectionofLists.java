public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lengthA = 0;
        int lengthB = 0;
        ListNode tempA = headA;
          ListNode tempB = headB;
      
        while(tempA!=null)
        {
            tempA = tempA.next;
            lengthA++;
        }
        
         while(tempB!=null)
        {
            tempB = tempB.next;
            lengthB++;
        }
   
        
          while (lengthA > lengthB) {
        headA = headA.next;
        lengthA--;
    }
        
            while (lengthB > lengthA) {
        headB = headB.next;
        lengthB--;
    }
        
        while (headA != headB) {
        headA = headA.next;
        headB = headB.next;
    }
    return headA;   
        
        
    }
}
