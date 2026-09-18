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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        if(head==null||head.next==null){
            return null;
        }
        int size=len(head);
        if(size==k){
            return head.next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy.next;
        for(int i=0;i<size-k-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return dummy.next;

    }
    public static int len(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        return size;
    }
}