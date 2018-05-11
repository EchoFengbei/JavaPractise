package niuke.tree;

public class ConvertTest {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        if (pRootOfTree.left == null && pRootOfTree.right == null) return pRootOfTree;
         //将左子树构造成双链表
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode p = left;//p保存链表头结点

        while (p != null && p.right != null){
            //p.right为左子树的最后一个元素，root将来要跟在最后一个元素后面
            p = p.right;
        }

        if (left != null){
            p.right = pRootOfTree;
            pRootOfTree.left = p;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if (right != null){
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        return (left != null)? left:pRootOfTree;
    }
}
