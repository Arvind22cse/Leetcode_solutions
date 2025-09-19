/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int l=0;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                l=lengthcycle(slow);
                break;
            }
        }
        if(l==0){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(l>0){
            s=s.next;
            l--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
    static int lengthcycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                int l=0;
                ListNode temp=slow;
               do{
                    l++;
                    temp=temp.next;
                }while(fast!=temp);
                return l;
            }
        } 
         return 0;
}
}