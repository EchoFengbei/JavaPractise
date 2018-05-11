package niuke.tree;

import java.util.ArrayList;
import java.util.Collections;

public class GetMediaTreeTest {
    ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
        Collections.sort(list);
    }

    public Double GetMedian() {
        double mid = 0.0;
        double pre = 0.0;
        double post = 0.0;
        if (list.size() % 2 != 0){
            mid = Double.valueOf(list.get(list.size()/2));
        }else{
            pre = Double.valueOf(list.get(list.size()/2));
            post = Double.valueOf(list.get(list.size()/2 - 1));
            mid = (pre + post)/2;
        }
        return mid;
    }

//    public TreeNode myInsert(TreeNode root, int num){
//        if (root == null){
//            root = new TreeNode(num);
//        }else {
//            if (num < root.val) root.left = myInsert(root,num);
//            else root.right = myInsert(root,num);
//        }
//        return root;
//    }
//    void LDRTraverse(TreeNode root){
//        if (root != null){
//            LDRTraverse(root.left);
//            list.add(root.val);
//            LDRTraverse(root.right);
//        }
//    }
}
