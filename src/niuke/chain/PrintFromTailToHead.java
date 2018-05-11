package niuke.chain;

import java.util.ArrayList;
import java.util.Stack;

public class PrintFromTailToHead {
    ArrayList<Integer> list = new ArrayList<Integer>();
    Stack<ListNode> stack = new Stack<ListNode>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        while(listNode != null){
//            stack.push(listNode);
//            listNode = listNode.next;
//        }
//        while (!stack.empty()){
//            ListNode node = (ListNode) stack.pop();
//            list.add(node.val);
//        }
//        return list;

        //采用递归
        if (listNode != null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;



    }
}
