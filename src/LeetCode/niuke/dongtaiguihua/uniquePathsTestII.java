package LeetCode.niuke.dongtaiguihua;

import java.util.Arrays;

public class uniquePathsTestII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;//行
        int n = obstacleGrid[0].length;//列

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ){
            if (obstacleGrid[i][0] == 1){
                while (i < m){
                    dp[i][0] = 0;
                    i ++;
                }
            }else {
                dp[i][0] = 1;
                i ++;
            }
        }
        for (int j = 0; j < n;){
            if (obstacleGrid[0][j] == 1){
                while (j < n){
                    dp[0][j] = 0;
                    j ++;
                }
            }else{
                dp[0][j] = 1;
                j ++;
            }
        }

        for (int i = 1; i < m; i ++){
            for (int j = 1; j < n; j ++){
                if (obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] array = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(array));
    }
}
