package niuke;

public class BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {
        return helper(root,0);
    }
    private int helper(TreeNode root, int sum)
    {
        if(root == null)
            return 0;
        sum = sum + root.val;
        if(root.left==null && root.right==null)
            return sum;
        return helper(root.left,sum)+helper(root.right,sum);
    }
}
