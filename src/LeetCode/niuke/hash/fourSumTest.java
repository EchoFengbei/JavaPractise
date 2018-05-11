package LeetCode.niuke.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class fourSumTest {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (num == null || num.length < 4) return res;
        Arrays.sort(num);
        for (int i = 0 ; i+3 < num.length; i ++){
//            if (i != 0 && num[i] == num[i-1]) continue;
            for (int j = i+1; j+2 < num.length; j ++){
                int left = j + 1;
                int right = num.length-1;
//               if ( num[j] == num[j-1]) continue;
                while (left < right){
                    int sum = num[left] + num[right];
                    if (sum + num[i] + num[j] == target){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[left]);
                        list.add(num[right]);
                        if (res.contains(list)){
                            break;
                        }else res.add(list);
                        left ++;
                        right --;
                        while (left < right && num[left] == num[left-1]){
                            left ++;
                        }
                        while (left < right && num[right] == num[right+1]){
                            right --;
                        }
                    }else if(sum + num[i] + num[j] < target){
                        left ++;
                    }else{
                        right --;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {-1,0,1,2,-1,-4};
        System.out.println(fourSum(array,-1));
    }
}
