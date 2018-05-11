package LeetCode.niuke.array;

import com.sun.deploy.panel.ITreeNode;

import java.util.Arrays;

public class threeSumClosest {
    public int threeSumClosest(int[] num, int target) {
//        int min = Integer.MAX_VALUE;
//        int res = 0;
//        for (int i = 0; i < num.length; i ++){
//            for (int j = i+1; j < num.length; j ++){
//                for (int k = j+1; k < num.length; k ++){
//                    int sum = num[i] + num[j] + num[k];
//                    int error = Math.abs(sum-target);
//                    if (error == 0) return sum;
//                    if (error < min){
//                        min = error;
//                        res = sum;
//                    }
//                }
//            }
//        }
//        return res;
        if (num == null || num.length < 3) return Integer.MIN_VALUE;
        int  res = num[0] + num[1] + num[num.length-1];
        Arrays.sort(num);
        for (int i = 0; i < num.length-2; i ++){
            int left = i +1;
            int right = num.length-1;
            while (left < right){
                int sum = num[i] + num[left] + num[right];
                if (sum > target) right--;
                else left++;
                if (Math.abs(sum-target) < Math.abs(res-target)) res = sum;
            }
        }
        return res;
    }
}
