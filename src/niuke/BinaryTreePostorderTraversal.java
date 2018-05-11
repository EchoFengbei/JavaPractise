package niuke;

import java.util.ArrayList;


public class BinaryTreePostorderTraversal {
    ArrayList<Integer> list = new ArrayList();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        if (root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }
}
