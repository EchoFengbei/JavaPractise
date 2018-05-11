package niuke;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null) return false;
        if (root.left==null && root.right==null && root.val==sum) return true;
        boolean left = hasPathSum(root.left,sum-root.val);
        boolean right = hasPathSum(root.right, sum-root.val);
        return left || right;
    }

}
