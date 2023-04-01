/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ListNode result = new ListNode();
        ListNode curr = result;
        boolean done = false;

        while(done == false)
        {
            done = true;

            for(ListNode l : lists)
            {
                if(l != null)
                {
                    done = false;
                }
            }

            if(done == true)
            {
                break;
            }

            int nextVal = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int i = 0; i < lists.length; i++)
            {
                if(lists[i] != null)
                {
                    if(lists[i].val < nextVal)
                    {
                        nextVal = lists[i].val;
                        minIndex = i;
                    }
                }
            }
            
            System.out.println(nextVal);

            lists[minIndex] = lists[minIndex].next;
            curr = new ListNode(nextVal);
            curr = curr.next;
        }
        
        return result.next;
    }
}