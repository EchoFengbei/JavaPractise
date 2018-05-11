package LeetCode;

public class TwoSumTest {
    static int[] twoSum(int[] nums, int target) {
        int[] index = {-1,-1};
        for(int i = 0; i < nums.length; i ++){
            for(int j = i+1; j < nums.length; j ++){
                if(nums[i] + nums[j] == target){
                    index = new int[]{i, j};
                    return index;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int [] ans = twoSum(new int[]{3, 2, 3},6);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
