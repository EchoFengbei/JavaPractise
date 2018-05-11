package niuke.tree;



public class MirrorTree {
    public void Mirror(TreeNode root) {
        if (root != null){
            if(root.left != null || root.right != null){
                TreeNode temp = root.right;
                root.right = root.left;
                root.left = temp;
            }
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
