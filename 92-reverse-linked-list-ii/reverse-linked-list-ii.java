
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp1 = dummy;
        for(int i=1 ; i<left;i++){
            temp1 = temp1.next;
        }
        ListNode start = temp1.next;
        ListNode next_start = start.next;
        for(int i=0 ; i<right-left ;i++){
            start.next = next_start.next;
            next_start.next = temp1.next;
            temp1.next = next_start;
            next_start = start.next;
        }
        return dummy.next;
    }
}