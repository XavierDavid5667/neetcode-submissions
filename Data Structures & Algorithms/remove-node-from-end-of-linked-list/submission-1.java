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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode front=curr.next;
            curr.next=prev;

            prev=curr;
            curr=front;
        }

        head=prev;
      if (n == 1) {
            head = head.next;
        } else {

            curr = head;
            int count = 1;
        while(curr!=null){
            
            if(count==n-1){
                curr.next=curr.next.next;
                break;
            }
            curr = curr.next;
            count++;
        }
        }

         prev=null;
         curr=head;

        while(curr!=null){
            ListNode front=curr.next;
            curr.next=prev;

            prev=curr;
            curr=front;
        }

        return prev;



    }
}
