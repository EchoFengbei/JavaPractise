package niuke;

public class SumRootToLeafNumbers {
//    public int sumNumbers(TreeNode root) {
//        int leftSum = 0;
//        int rightSum = 0;
//        if (root ==null) return 0;
//        if (root.left==null && root.right==null) return root.val+sum*10;
//        leftSum = root.val*10 + sumNumbers(root.left);
//        rightSum = root.val*10 + sumNumbers(root.right);
//        return leftSum + rightSum;
//
//
//
//    }
    public int sumNumbers(TreeNode root){
        return helper(root,0);
    }
    private int helper(TreeNode root, int sum)
    {
        if(root == null)
            return 0;
        sum = sum *10 + root.val;
        if(root.left==null && root.right==null)
            return sum;
        return helper(root.left,sum)+helper(root.right,sum);
    }
}
