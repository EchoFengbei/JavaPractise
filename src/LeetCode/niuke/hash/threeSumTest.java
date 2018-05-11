package LeetCode.niuke.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class threeSumTest {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (num == null || num.length < 3) return res;

        Arrays.sort(num);
        for (int i = 0; i+2 < num.length; i ++){
            if ((i != 0) && num[i] == num[i-1])
                continue;
            int sum;
            int left = i+1;
            int right = num.length-1;
            while (left < right){
                sum = num[left] + num[right];
                if (sum + num[i] == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);
                    res.add(list);
                    left ++;
                    right --;
                    while (left < right && num[left] == num[left-1]){
                        left ++;
                    }
                    while (left < right && num[right] == num[right+1]){
                        right --;
                    }
                }else if (sum + num[i] < 0){
                    left ++;
                }else right --;
            }
        }
        return res;
    }
}
