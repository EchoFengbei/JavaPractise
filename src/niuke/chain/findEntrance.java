package niuke.chain;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class findEntrance {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode slow;
        ListNode fast;
        if (pHead == null || pHead.next == null) return null;
        slow = pHead.next;
        fast = pHead.next.next;
        while (fast != null){
            if (slow == fast) break;//单链表有环
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == null) return null;//单链表的情况

        ListNode p = pHead;
        while (p != null){
            if (slow == p) return p;
            p = p.next;
            slow = slow.next;
        }
        return null;
    }
}
