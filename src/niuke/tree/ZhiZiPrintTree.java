package niuke.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZhiZiPrintTree {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();//保存所有的节点
        Queue<TreeNode> queue = new LinkedList<>();//采用双向队列
        Stack<TreeNode> stack = new Stack<>();//用来保存逆序的输出
        boolean LToRflag = true;//从左到右打印的标志，如果为true，则从队头打印，如果false，从队尾打印
        if (pRoot == null) return res;
        queue.add(pRoot);
        //只要队列不为空，就出队，
        //判断当前节点是否有左右孩子，如果有，入队
        while (!queue.isEmpty()){
            //出队的时候，保证每一层一起出
            TreeNode temp = null;
            ArrayList<Integer> list = new ArrayList<>();
            int length = queue.size();
            for (int i = 0; i < length; i ++){
                if (LToRflag){
                    temp  = queue.poll();
                    list.add(temp.val);
                }else {
                    temp = queue.poll();
                    stack.push(temp);//将元素压栈
                }
                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
            }
            if (LToRflag) LToRflag = false;
            else LToRflag = true;
            while (!stack.empty()){
                list.add(stack.pop().val);
            }
            res.add(list);
        }
        return res;
    }
}
