/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @return {ListNode}
     */
    reverseList(head) {
        if(!head || !head.next) return head;

        let prev = null;
        let node = head;

        while(node){
            const temp = node.next;

            node.next = prev;
            prev = node;
            node = temp;
        }

     return prev;

        // node1 -> node2 -> node3 -> null
        // prev <-node1
    }
}
