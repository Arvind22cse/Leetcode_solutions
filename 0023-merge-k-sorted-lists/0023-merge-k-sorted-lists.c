// Function to merge two sorted linked lists
struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode dummy;
    struct ListNode* tail = &dummy;
    dummy.next = NULL;

    while (l1 && l2) {
        if (l1->val < l2->val) {
            tail->next = l1;
            l1 = l1->next;
        } else {
            tail->next = l2;
            l2 = l2->next;
        }
        tail = tail->next;
    }

    // Attach the remaining nodes
    tail->next = l1 ? l1 : l2;
    return dummy.next;
}

// Function to merge k sorted linked lists using divide and conquer
struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
    if (listsSize == 0) return NULL;
    if (listsSize == 1) return lists[0];

    // Divide and conquer merging
    while (listsSize > 1) {
        int newListsSize = (listsSize + 1) / 2;
        for (int i = 0; i < listsSize / 2; i++) {
            lists[i] = mergeTwoLists(lists[i], lists[listsSize - 1 - i]);
        }
        listsSize = newListsSize;
    }
    return lists[0];
}