package niuke.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();//保存所有的节点
        Queue<TreeNode> queue = new LinkedList<>();
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
                temp  = queue.poll();
                list.add(temp.val);

                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
