package niuke.tree;

public class SerializeTree {
    public int index = -1;//字符数组指针
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        String[] strings = str.split(",");
        return myDeserialize(strings);
    }
    public TreeNode myDeserialize(String[] strings){
        index ++;
        TreeNode root = null;//新建一个保存的TreeNode类型的节点
        if (!strings[index].equals("#")){
            root = new TreeNode(Integer.valueOf(strings[index]));
            root.left = myDeserialize(strings);
            root.right = myDeserialize(strings);
        }
        return root;
    }
}
