package niuke.zhishiqianyi;

import java.util.function.Predicate;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseListTest {
    public ListNode ReverseList(ListNode head) {
        //遍历原来的链表，头插法
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode node = head;
        ListNode pre = null;
        ListNode newHead = null;
        while (node != null){
            ListNode next = node.next;
            node.next = pre;
            if (next == null){
                newHead = node;
            }
            pre = node;
            node = next;
        }
        return  newHead;
    }
}
