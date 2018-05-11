package niuke.chain;



class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class CloneTest {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return pHead;
        //step1:复制原始链表
        RandomListNode pCur = pHead;
        while (pCur != null){
            RandomListNode node = new RandomListNode(pCur.label);
            node.next = pCur.next;
            pCur.next = node;
            pCur = node.next;
        }
        //step2:从开头节点开始遍历，在新的链表中更新兄弟节点
        pCur = pHead;
        while (pCur != null){
            if (pCur.random != null){
                pCur.next.random = pCur.random.next;
            }
            pCur = pCur.next.next;
        }
        //step3:拆分链表,新的链表的头结点和当前操作节点
        RandomListNode newHead = pHead.next;
        RandomListNode newCur = newHead;
        //复制节点之后的链表头和操作节点
        pCur = pHead;
        while (pCur != null){
            pCur.next = pCur.next.next;
            if (newCur != null){
                newCur.next = newCur.next.next;
            }
            newCur = newCur.next;
            pCur = pCur.next;

        }
        return newHead;
    }
}
