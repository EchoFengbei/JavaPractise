package LeetCode.niuke.hash;

import java.util.HashMap;
import java.util.Map;

public class twoSumTest {
    public static int[] twoSum(int[] numbers, int target) {
//        int[] res = new int[2];
//        if (numbers == null || numbers.length <= 1) {
//            res = new int[]{-1, -1};
//            return res;
//        }
//        for (int i = 0 ; i < numbers.length; i ++){
//            for (int j = i+1; j < numbers.length; j ++){
//                if (numbers[i] + numbers[j] == target){
//                    res[0] = i;
//                    res[1] = j;
//                    break;
//                }
//            }
//        }
//        return res;
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < numbers.length; i ++){
            int val = numbers[i];
            if (map.containsKey(target-val)){
                res[0] = map.get(target-val)+1;
                res[1] = i+1;
            }else map.put(val,i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] res = twoSum(numbers,23);
        for (int i = 0; i < res.length; i ++){
            System.out.println(res[i]);
        }
    }
}
