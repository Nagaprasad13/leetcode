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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        head=reverse(head);
        while(head!=null){
            int val=head.val;
            if(st.isEmpty()){
                st.push(val);
            }
            else if(!st.isEmpty()&&val>=st.peek()){
                st.push(val);
            }
            head=head.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int num:st){
            System.out.println(num);
            ListNode newNode=new ListNode(num);
            newNode.next=curr.next;
            curr.next=newNode;
        }
        return dummy.next;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
        
    }
}