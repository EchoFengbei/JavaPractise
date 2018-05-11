package niuke.tree;



public class reConstructBinaryTreeTest {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length != in.length) return null;
        return myBuildTree(pre,0,pre.length-1, in, 0, in.length-1);
    }
    public TreeNode myBuildTree(int[] pre,int preStart,int preEnd,int[] in, int inStart, int inEnd){
        if (inStart > inEnd) return null;

        TreeNode root = new TreeNode(pre[preStart]);
        int position = findPosition(in,inStart,inEnd,pre[preStart]);
        root.left = myBuildTree(pre,preStart+1,preStart + position - inStart,in,inStart,position-1);
        root.right = myBuildTree(pre,position - inEnd + preEnd +1,preEnd,in,position+1,inEnd);
        return root;
    }
    public int findPosition(int[] array, int start, int end, int key){
        for (int i = start; i <= end; i ++){
            if (key == array[i]) return i;
        }
        return -1;
    }
}
