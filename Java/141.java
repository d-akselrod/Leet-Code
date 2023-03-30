/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        if (head == null || head.next == null) 
        {
            return false;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while (slowPointer != fastPointer) 
        {
            if (fastPointer.next == null || fastPointer == null || fastPointer.next.next == null) 
            {
                return false;
            }

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return true;
    }
}
