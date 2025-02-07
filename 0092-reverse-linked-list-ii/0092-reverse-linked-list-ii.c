/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
    if(!head || left == right) return head;
    struct ListNode dummy;
    dummy.next=head;
    struct ListNode *prev=&dummy;
    for(int i=0;i<left-1;i++){
        prev=prev->next;
    }
    struct ListNode *curr=prev->next;
    struct ListNode *nextnode=NULL;
    struct ListNode *prevnode=NULL;
   for(int i=0;i<=right-left;i++){
    nextnode=curr->next;
    curr->next=prevnode;
    prevnode=curr;
    curr=nextnode;
   }
   prev->next->next=curr;
   prev->next=prevnode;
   return dummy.next;

}