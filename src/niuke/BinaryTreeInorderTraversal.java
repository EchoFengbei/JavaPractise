package niuke;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> inorderTraversal(TreeNode root){
        TreeNode node = root;//在栈中操作节点的指针节点
        Stack<TreeNode> stack = new Stack<TreeNode>();//用来存储节点的栈
        while (node!= null || !stack.empty()){
            //进栈
            while (node!=null){
                stack.push(node);
                node = node.left;//一直向左寻找
            }
            //指针节点为空，栈不为空
            if (!stack.empty()){
                node = stack.pop();
                list.add(node.val);//弹出栈顶元素，保存在 list中
                node = node.right;
            }
        }
        return list;
    }
}
