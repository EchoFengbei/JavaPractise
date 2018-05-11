package niuke.tree;

public class isBalancedTree {
    public boolean isBalance(TreeNode root){
        if (depth(root) > 1) return false;
        else return true;
    }
    public int depth(TreeNode root){
        if (root == null) return 0;
        if (root.right == null && root.left == null) return 1;
        int dLeft = depth(root.left);
        int dRight = depth(root.right);
        return Math.abs(dLeft-dRight)+1;
    }
}
