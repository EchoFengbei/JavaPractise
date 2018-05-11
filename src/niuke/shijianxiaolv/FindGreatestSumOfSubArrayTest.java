package niuke.shijianxiaolv;

public class FindGreatestSumOfSubArrayTest {
    public static int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0];//保存所有子数组的和的最大值
        int max = array[0];//包含array[i]的子数组的最大值
        for (int i = 1; i < array.length; i ++){
            max = Math.max(max + array[i],array[i]);
            res = Math.max(max,res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(array));
    }
}
