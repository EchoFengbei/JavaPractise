package niuke.tree;

public class HasSubtreTest {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if (root2 == null) return false;
        //当root1和root2都不为空时，进行判断，否则，返回false
        if (root1 != null && root2 != null){
            //如果根节点值相等，以根节点为开始，一直对比下去
            if (root1.val == root2.val){
                res = DoesRoot1HaveRoot2(root1, root2);
            }
            //否则，分别对比root1的左右子节点和root2的根节点
            if (!res){
                res = DoesRoot1HaveRoot2(root1.left,root2);
            }
            if (!res){
                res = DoesRoot1HaveRoot2(root1.right,root2);
            }
        }
        return res;
    }
    public  boolean DoesRoot1HaveRoot2(TreeNode root1, TreeNode root2){
        if (root2 == null) return true;//root2先遍历完，都能匹配
        if (root1 == null) return false;//root1先遍历完，则不能匹配
        if (root1.val != root2.val) return false;//有一个点没有匹配，就false
        //判断子节点
        return DoesRoot1HaveRoot2(root1.left,root2.left) && DoesRoot1HaveRoot2(root1.right,root2.right);
    }
}
