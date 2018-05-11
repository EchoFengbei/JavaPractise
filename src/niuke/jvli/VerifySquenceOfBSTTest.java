package niuke.jvli;

public class VerifySquenceOfBSTTest {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) return true;
        if (sequence.length ==1) return true;
        return isPostTraverse(sequence,0,sequence.length-1);
    }
    public boolean isPostTraverse(int[] array, int start, int end){
        if (start >= end) return true;
        int i = start;
        //找到根节点的右子树
        while (array[i] < array[end]){
            i ++;
        }
        for (int j = i; j < array.length-1;j ++){
            if (array[j] < array[end]) return false;
        }
        //递归判断左右子树是不是二排序二叉树
        return isPostTraverse(array,start,i-1) && isPostTraverse(array,i+1,end);
    }
}
