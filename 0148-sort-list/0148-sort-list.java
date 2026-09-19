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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=null,slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;//head is disconnected, so it gives firstHalf
        ListNode firstHalf=sortList(head);
        ListNode secondHalf=sortList(slow);
        return merge(firstHalf,secondHalf);
    }
    public static ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                curr.next=left;
                left=left.next;
            }
            else{
                curr.next=right;
                right=right.next;
            }
            curr=curr.next;//updating the curr...
        }
        if(right!=null){
            curr.next=right;
        }//any one of the half contains extra side(if it has odd length)..
        else{
            curr.next=left;
        }
        return dummy.next;
    }
}