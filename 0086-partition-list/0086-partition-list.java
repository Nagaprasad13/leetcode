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
    public ListNode partition(ListNode head, int x) {
        ListNode less=new ListNode(0);
        ListNode l1=less;
        ListNode more=new ListNode(0);
        ListNode l2=more;
        ListNode cur1=head;
        while(cur1!=null){
            int val=cur1.val;
            if(val<x){
                l1.next=cur1;
                l1=l1.next;
            }
            else if(val>=x){
                l2.next=cur1;
                l2=l2.next;
            }
            cur1=cur1.next;
        }
        System.out.println(l1);
        l2.next=null;
        l1.next=more.next;
        return less.next;
    }
}