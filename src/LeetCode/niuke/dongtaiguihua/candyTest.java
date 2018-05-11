package LeetCode.niuke.dongtaiguihua;

public class candyTest {
    public  static int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) return 0;
        int[] spaceNum = new int[ratings.length];

        for (int i = 0; i < ratings.length; i ++){
            int space = 0;
            for (int j = i+1; j < spaceNum.length; j ++){
                if (ratings[j] >= ratings[j-1]){
                    break;
                }else {
                    space ++;
                }
            }
            spaceNum[i] = space;
        }

        int[] candyNum  = new int[ratings.length];

        candyNum[0] = spaceNum[0] +1;
        int sum = candyNum[0];

        for (int i = 1; i < ratings.length; i ++){
            //左边孩子的糖果数
            int leftCandy = 1;
            if (ratings[i] > ratings[i-1]){
                leftCandy = candyNum[i-1] +1;
            }
             int rightCandy = spaceNum[i] +1;
            candyNum[i] = Math.max(leftCandy,rightCandy);
            sum = sum + candyNum[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,2};
        System.out.println(candy(array));
    }
}
