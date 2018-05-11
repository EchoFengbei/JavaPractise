package niuke.tree;

public class FromToLeafDepthTest {
    public int fromRootToLeafDepth(TreeNode root){
        return helper(root,0);
    }
    public int helper(TreeNode root,int num){
        if(root == null)
            return 0;
        num = num + 1;
        if(root.left==null && root.right==null)
            return num;
        return Math.max(helper(root.left,num),helper(root.right,num));
    }
}
