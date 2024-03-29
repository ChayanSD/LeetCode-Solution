//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

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
    public ListNode deleteDuplicates(ListNode node) {
        if(node ==null){
            return node;
        }
        ListNode head = node;
        while(node.next != null){
            //cheak 
            if(node.val==node.next.val){
                //skip
                node.next =node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}
