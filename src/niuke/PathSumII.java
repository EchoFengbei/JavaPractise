package niuke;

import java.util.ArrayList;

public class PathSumII {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    ArrayList<Integer> leftList = new ArrayList<>();
    ArrayList<Integer> rightList = new ArrayList<>();

    public boolean hasPathSum(TreeNode root, int sum){
        if (root==null) return false;
        if (root.left==null && root.right==null && root.val==sum) {
            return true;
        }
        boolean left = hasPathSum(root.left,sum-root.val);
        boolean right = hasPathSum(root.right, sum-root.val);
        return left || right;
    }
}
