package niuke.daimawanzheng;



class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class FindKthToTailTest {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) return null;
        if (head.next == null && k == 1) return head;
        if (k <= 0) return null;
        /////
        ListNode slow = head;
        ListNode fast = head;
        int count = 1;//用来保存fast的步数
        while ( fast != null && count < k ){
            fast = fast.next;
            count ++;
        }
        if (fast == null) return null;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
