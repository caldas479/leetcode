class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     *
     * Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
     * After doing so, return the head of the final linked list.  You may return any such answer.
     */
    public ListNode removeZeroSumSublists(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr != null) {
            int sum = 0;
            ListNode temp = curr.next;
            while (temp != null) {
                sum += temp.val;
                if (sum == 0) {
                    curr.next = temp.next;
                }
                temp = temp.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
        
}
