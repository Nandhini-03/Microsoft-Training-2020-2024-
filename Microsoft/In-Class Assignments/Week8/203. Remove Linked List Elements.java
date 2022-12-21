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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode empty =new ListNode(0);
        empty.next=head;
        head=empty;
        while(head.next != null)
        {
            if(head.next.val == val)
            {
                head.next=head.next.next;
            }
            else
            {
                head=head.next;
            }
        }
        return empty.next;
    }
}
