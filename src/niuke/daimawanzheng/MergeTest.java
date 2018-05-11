package niuke.daimawanzheng;

public class MergeTest {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newList = null;
        ListNode newHead = null;
        if (list1 == null) return list2;
        if (list2 == null) return  list1;

        //处理后面的节点
        while (list1!= null && list2 != null){
            if (list1.val <= list2.val){
                if (newHead == null)
                    newHead = newList = list1;
                else {
                    newList.next = list1;
                    newList = newList.next;
                }
                list1 = list1.next;
            }else {
                if (newHead == null)
                    newHead = newList = list2;
                else {
                    newList.next = list2;
                    newList = newList.next;
                }
                list2 = list2.next;
            }
        }
        if (list1 == null){
            newList.next = list2;
        }else newList.next = list1;
        return newHead;
    }
}
