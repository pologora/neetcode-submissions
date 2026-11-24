/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
// 123     235
class Solution {
    /**
     * @param {ListNode} list1
     * @param {ListNode} list2
     * @return {ListNode}
     */
    mergeTwoLists(list1, list2) {
        let node1 = list1;
        let node2 = list2;
        const dummy = new ListNode();
        let head = new ListNode();
        dummy.next = head;

        while(node1 && node2){
            const val1 = node1.val;
            const val2 = node2.val;

            if(val1 <= val2){
                head.next = node1;
                node1 = node1.next;
            }else {
                head.next = node2;
                node2 = node2.next;
            }

            head = head.next;
        }

        if(node1){
            head.next = node1;
        }

        if(node2){
            head.next = node2;
        }

        return dummy.next.next;
    }
}
