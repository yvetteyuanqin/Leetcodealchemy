/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;
        //Calculate list length
        ListNode curr=head;
        int len=1;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        ListNode end=curr;
        curr=head;
        for(int i=0;i<len-k%len-1;i++){//mod when rotate step larger than actual list length
            curr=curr.next;
            
        }
        end.next=head;
        head=curr.next;
        curr.next=null;
        
        return head;
        
    }
}