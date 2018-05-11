package niuke;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class MinimumDepthOfBinaryTree {
    public int run(TreeNode root) {
        if (root == null) return 0;
        int depLeftLeaf = run(root.left);
        int depRightLeaf = run(root.right);
        if (root.left ==null) return depRightLeaf+1;
        if (root.right ==null) return depLeftLeaf+1;
        return Math.min(depLeftLeaf,depRightLeaf)+1;
    }
}
