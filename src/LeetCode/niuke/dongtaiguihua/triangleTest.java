package LeetCode.niuke.dongtaiguihua;

import java.util.ArrayList;

public class triangleTest {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {

        //思路是贪心算法，觉得自己叼叼的
//        int sum = triangle.get(0).get(0);
//        int index = 0;
//        for (int i = 1; i < triangle.size(); i++){
//            if (index -1 >=0 && index+1 < triangle.get(i).size()){
//                int minList = Math.min(triangle.get(i).get(index),triangle.get(i).get(index+1));
//                sum = sum + minList;
//                index = triangle.get(i).indexOf(minList);
//            }
//            if (index == 0 && index+1 < triangle.get(i).size()){
//                int minList = Math.min(triangle.get(i).get(index),triangle.get(i).get(index+1));
//                sum = sum + minList;
//                index = triangle.get(i).indexOf(minList);
//            }
//
//        }
//        return sum;

        //动态规划，建一个2维数组，来保存那些中间值，用来寻找最小路径
//        int[][] dp = new int[triangle.size()][triangle.size()];
//        dp[0][0] = triangle.get(0).get(0);
        for (int i = triangle.size()-2; i >=0; i--){
            for (int j = 0; j < triangle.get(i+1).size()-1; j ++){

                int localMin = Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,triangle.get(i).get(j) + localMin);
            }
        }
        return triangle.get(0).get(0);
    }


    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(2);

    }
}
