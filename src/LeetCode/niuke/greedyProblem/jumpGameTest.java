package LeetCode.niuke.greedyProblem;

public class jumpGameTest {
    public static boolean canJump(int[] A) {
        int len = A.length;
        int i = 0;
        int sum = 0;
        int count = 0;
        while (i < len){
            sum = sum + A[i];
            i = sum;
            count ++;
            if (sum >= len-1) return true;
            if (count > len) return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {2,3,1,1,4};
        int[] num1 = {3,2,1,0,4};
        int[] num2 = {2,0};
        int[] num3 = {1};
        System.out.println(canJump(num3));
    }
}
