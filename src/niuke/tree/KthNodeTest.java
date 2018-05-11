package niuke.tree;

import java.util.ArrayList;
import java.util.Collections;

public class KthNodeTest {
    ArrayList<Integer> list = new ArrayList<>();
    TreeNode node = null;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (k <= 0) return null;
        LDRTraverse(pRoot);
//        Collections.sort(list);
        if (k > list.size()) return null;
        for (int i = 0; i < list.size(); i ++){
            if (i+1 == k){
                node = new TreeNode(list.get(i));
                break;
            }
        }
        return node;
    }
    void LDRTraverse(TreeNode root){
        if (root != null){
            LDRTraverse(root.left);
            list.add(root.val);
            LDRTraverse(root.right);
        }
    }

    //牛客网的答案，可以参考


//    int index = 0; //计数器
//    TreeNode KthNode(TreeNode root, int k) {
//        if(root != null){ //中序遍历寻找第k个
//            TreeNode node = KthNode(root.left,k);
//            if(node != null) return node;
//            index ++;
//            if(index == k) return root;
//            node = KthNode(root.right,k);
//            if(node != null) return node;
//        }
//        return null;
//    }
}
