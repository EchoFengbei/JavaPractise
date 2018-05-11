package LeetCode.niuke.fenzhi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class permutationTestII {
    Set<ArrayList<Integer>> sets = new HashSet<>();
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        myPermutation(num,0);
        for (ArrayList<Integer> set : sets ){
            res.add(set);
        }
        return res;
    }
    //深度优先遍历
    public void myPermutation(int[] num, int start){
        if (start == num.length-1){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < num.length; i++){
                list.add(num[i]);
            }
            sets.add(list);
        }
        //从当前位置开始，跟后面的数字进行交换
        for (int j = start; j < num.length; j ++){
            swap(num,start,j);
            myPermutation(num,start+1);
            swap(num,j,start);
        }
    }
    public void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
