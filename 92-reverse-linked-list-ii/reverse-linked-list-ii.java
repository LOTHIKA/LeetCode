
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
        ListNode p = temp1.next;
        ListNode m = p.next;
        for(int i=0 ; i<right-left ;i++){
            p.next = m.next;
            m.next = temp1.next;
            temp1.next = m;
            m = p.next;
        }
        return dummy.next;
    }
}