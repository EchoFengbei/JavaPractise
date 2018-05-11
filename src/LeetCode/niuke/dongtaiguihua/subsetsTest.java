package LeetCode.niuke.dongtaiguihua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class subsetsTest {
    public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(S);
//        return backtrack(res,new ArrayList<>(),S,0);//这是没有排序的结果，
        //增加排序
        backtrack(res,new ArrayList<>(),S,0);
        Collections.sort(res, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                int o1size = o1.size();
                int o2size = o2.size();
                if (o1size != o2size){
                    return Integer.compare(o1size,o2size);
                }else return 0;
            }
        });
        return res;
    }
    public static ArrayList<ArrayList<Integer>> backtrack(ArrayList<ArrayList<Integer>> res,
                                                   ArrayList<Integer> list,int[] num,int start){
        res.add(new ArrayList<>(list));
        for (int i = start; i < num.length; i ++){
            list.add(num[i]);
            backtrack(res,list,num,i+1);
            list.remove(list.size()-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(subsets(num));
    }
}
