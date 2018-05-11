package LeetCode.niuke.dongtaiguihua;

import java.util.Arrays;

public class candyTestI {
    public int candy(int[] ratings){
        /*贪心算法实现，从左到右遍历，分数较高的多拿一颗糖，分数少的只拿一颗糖
        从右向左遍历，分数较高的确保比右边的多拿一颗糖
        * */
        int sum = 0;
        int[] candy = new int[ratings.length];
        Arrays.fill(candy,1);
        for (int i = 1; i < ratings.length; i ++){
            if (ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] +1;
            }else candy[i] = 1;
        }
        for (int j = ratings.length-1; j > 0; j --){
            if (ratings[j-1] > ratings[j] && candy[j-1] <= candy[j]){
                candy[j-1] = candy[j] + 1;
            }
        }
        for (int k = 0; k < candy.length; k ++){
            sum = sum + candy[k];
        }
        return sum;
    }
}
