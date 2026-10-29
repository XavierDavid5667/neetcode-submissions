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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prev=null;
        ListNode head=null;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                if(prev==null){

                    ListNode node=new ListNode();
                    node.val=list1.val;
                    head=node;
                    prev=node;
                }else{
                    ListNode node=new ListNode();
                    node.val=list1.val;
                    prev.next=node;
                    prev=node;

                }
                list1=list1.next;
            }else{
                 if(prev==null){
                    ListNode node=new ListNode();
                    node.val=list2.val;
                    prev=node;
                     head=node;
                }else{
                    ListNode node=new ListNode();
                    node.val=list2.val;
                    prev.next=node;
                    prev=node;

                }
                list2=list2.next;

            }
        }
        while(list1!=null){
            if(prev==null){
                    ListNode node=new ListNode();
                    node.val=list1.val;
                    prev=node;
                     head=node;
                }else{
                    ListNode node=new ListNode();
                    node.val=list1.val;
                    prev.next=node;
                    prev=node;

                }
                list1=list1.next;
        }
         while(list2!=null){
            if(prev==null){
                    ListNode node=new ListNode();
                    node.val=list2.val;
                    prev=node;
                     head=node;
                }else{
                    ListNode node=new ListNode();
                    node.val=list2.val;
                    prev.next=node;
                    prev=node;

                }
                list2=list2.next;
        }
        return head;
    }
}