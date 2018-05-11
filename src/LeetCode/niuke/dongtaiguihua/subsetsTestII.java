package LeetCode.niuke.dongtaiguihua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class subsetsTestII {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(num);
        return dfs(res,new ArrayList<>(),num,0);

    }
    public ArrayList<ArrayList<Integer>> dfs(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> list,
                                             int[] num,int start){
        res.add(new ArrayList<>(list));
        for (int i = start; i < num.length; i++){
            if(list.contains(num[i])) continue;//如果跟前一个字符重复，跳过
                list.add(num[i]);
                dfs(res,list,num,i+1);
                list.remove(list.size()-1);
        }
        return res;
    }
}
