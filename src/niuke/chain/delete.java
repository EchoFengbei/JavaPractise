package niuke.chain;

public class delete {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode first = new ListNode(-1);//保存返回值
        first.next = pHead;
        ListNode last = first;
        if(pHead == null) return null;
        if(pHead.next == null) return pHead;
        ListNode node = pHead;
        while(node != null && node.next != null){
            if(node.val == node.next.val){
                int temp = node.val;
                while(node != null && node.val == temp){
                    node = node.next;
                    last.next = node;
                }
            }else{
                last = node;
                node = node.next;
            }
        }
        return first.next;
    }
}
