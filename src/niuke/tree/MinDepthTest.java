package niuke.tree;



//public class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//
//}
public class MinDepthTest {
    public static int getMinDepth(TreeNode root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int minLeftTree = getMinDepth(root.left);
        int minRightTree = getMinDepth(root.right);
        return Math.min(minLeftTree,minRightTree)+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode L = new TreeNode(5);
        root.left = L;
        TreeNode R = new TreeNode(3);
        root.right = R;
        TreeNode LR = new TreeNode(2);
        L.right = LR;
        System.out.println(getMinDepth(root));

    }
}
