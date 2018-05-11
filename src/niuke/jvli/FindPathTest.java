package niuke.jvli;

import java.util.ArrayList;


public class FindPathTest {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) return res;
        list.add(root.val);
        target = target - root.val;
        if (root.left == null && root.right == null){
            res.add(new ArrayList<>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        return res;
    }

}
