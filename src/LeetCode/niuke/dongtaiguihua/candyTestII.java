package LeetCode.niuke.dongtaiguihua;

import java.util.Arrays;

public class candyTestII {
    //自己写的
    /*不能使用排序，会增加一些candy数组的数值
    比如[1,0,2],对应的candy[2,1,2]
    但是排序下来变成了[0,,1,2]，对应的candy[1,2,3]
    * */
    public static int candy(int[] ratings) {
        Arrays.sort(ratings);
        int sum = 0;
        int[] candy = new int[ratings.length];
        candy[0] = 1;
        sum = candy[0];
        for (int i = 1; i < ratings.length; i ++){
            if (ratings[i]>ratings[i-1]){
                candy[i] = candy[i-1] +1;
            }else candy[i] = 1;
            sum = sum + candy[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {2,2};
        System.out.println(candy(array));
    }
}
