package niuke.shikongpingheng;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class FindFirstCommonNodeTest {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;

        ListNode temp1 = pHead1;
        ListNode temp2 = pHead2;
        while (p1 != null && p2 !=  null){
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p2 == null){
            while (p1 != null){
                p1 = p1.next;
                temp1 = temp1.next;
            }
            p2 = pHead2;
            p1 = temp1;
        }
        if (p1 == null){
            while (p2 != null){
                p2 = p2.next;
                temp2 = temp2.next;
            }
            p1 = pHead1;
            p2 = temp2;
        }
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
