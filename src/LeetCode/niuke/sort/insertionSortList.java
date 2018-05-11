package LeetCode.niuke.sort;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
         next = null;
    }
}
public class insertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode newHead =new ListNode(-1);
        newHead.next=head;
        if(head==null)
            return null;
        ListNode cur=head.next;//从第二个节点开始遍历
        ListNode pre=head;//排好序的最后一个节点
        while(cur!=null)
        {
            if(cur.val<pre.val)
            {
                ListNode nextNode=cur.next;//保存下一个需要遍历的节点

                //寻找插入的合适位置
                ListNode cur2=newHead.next;
                ListNode temp=newHead ;//记录cur2前面一个节点
                while(cur.val>cur2.val&&cur2!=pre)
                {
                    temp=cur2;
                    cur2=cur2.next;
                }
                //进行插入
                temp.next=cur;
                cur.next=cur2;
                pre.next=nextNode;
                //继续遍历下一个节点
                cur=nextNode;
            }
            else {
                pre=cur;
                cur=cur.next;
            }

        }

        return newHead.next;
    }
}
