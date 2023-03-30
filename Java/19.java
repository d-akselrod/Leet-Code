public class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        int length = 0;

        while(curr != null) 
        {
            length += 1;
            curr = curr.next;
        }
        curr = dummy;

        for(int i = 0; i < (length - n); i++) 
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
}