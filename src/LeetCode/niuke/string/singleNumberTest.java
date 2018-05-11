package LeetCode.niuke.string;

import java.util.*;


public class singleNumberTest {
    public static int singleNumber(int[] A) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i ++){
            if (map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else map.put(A[i],1);
        }
        for (Map.Entry<Integer, Integer> set : map.entrySet()){
            if (set.getValue() == 1){
                A[0] = set.getKey();
            }
        }
        return A[0];
    }

    public static void main(String[] args) {
        int[] A = {-19,-46,-19,-46,-9,-9,-19,17,17,17,-13,-13,-9,-13,-46,-28};
        System.out.println(singleNumber(A));
    }
}
