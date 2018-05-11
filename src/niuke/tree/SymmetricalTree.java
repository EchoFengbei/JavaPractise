package niuke.tree;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class SymmetricalTree {
    boolean isSymmetrical(TreeNode pRoot){
        if (pRoot == null) return true;
        return isMirror(pRoot.left,pRoot.right);
    }
    public boolean isMirror(TreeNode tree1,TreeNode tree2){
        if (tree1 == null && tree2 == null) return true;
        if (tree1 != null && tree2 != null){
            return tree1.val == tree2.val && isMirror(tree1.left,tree2.right) && isMirror(tree1.right,tree2.left);
        }
        return false;
    }
}
