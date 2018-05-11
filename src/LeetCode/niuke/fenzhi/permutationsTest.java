package LeetCode.niuke.fenzhi;

import java.util.ArrayList;

public class permutationsTest {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<> ();
    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        myPermutation(num,0);
        return res;
    }
    //深度优先遍历
    public static void myPermutation(int[] num, int start){
        if (start == num.length-1){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < num.length; i++){
                list.add(num[i]);
            }
            res.add(list);
        }
        //从当前位置开始，跟后面的数字进行交换
        for (int j = start; j < num.length; j ++){
            swap(num,start,j);
            myPermutation(num,start+1);
            swap(num,j,start);
        }
    }
    public static void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(permute(num));
    }
}
