package LeetCode;

import java.util.Arrays;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i =0; i<nums.length; i=i+2){
            res = res + nums[i];
        }
        return res;
    }
}
