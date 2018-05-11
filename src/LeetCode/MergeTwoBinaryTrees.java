package LeetCode;



import java.util.ArrayList;
import java.util.List;

/**
 *
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2==null){
            return null;
        }else if (t1 == null) return t2;
        else if (t2 == null) return t1;
        TreeNode newNode = new TreeNode(0);
        newNode.left = mergeTrees(t1.left,t2.left);
        newNode.right = mergeTrees(t1.right,t2.right);
        return  newNode;
    }


        List<Integer> list = new ArrayList<>();

        public boolean isValidBST(TreeNode root) {
            if (root == null) return true;
            if (root.left == null && root.right == null) return true;
            inOrderTraversal(root);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) <= list.get(i - 1)) return false;
            }
            return true;
        }
        public void inOrderTraversal(TreeNode root) {
            if (root == null) return;
            inOrderTraversal(root.left);
            list.add(root.val);
            inOrderTraversal(root.right);
        }

    public static void main(String[] args) {
    }
}
