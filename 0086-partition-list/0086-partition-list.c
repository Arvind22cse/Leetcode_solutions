/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* partition(struct ListNode* head, int x){
    struct ListNode* less = (struct ListNode*)malloc(sizeof(struct ListNode));
    less->val = 0;
    less->next = NULL;
    
    struct ListNode* high = (struct ListNode*)malloc(sizeof(struct ListNode));
    high->val = 0;
    high->next = NULL;
    
    struct ListNode* lessT = less;
    struct ListNode* highT = high;
    
    while(head){
        if(head->val < x){
            lessT->next = head;
            lessT = lessT->next;
        }
        else{
            highT->next = head;
            highT = highT->next;
        }
        head = head->next;
    }
    lessT->next = high->next;
    highT->next = NULL;
    
    
    return less->next;
}