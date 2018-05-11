package LeetCode.niuke.dongtaiguihua;

public class minimumPathSumTest {
    public static int minPathSum(int[][] grid) {
        //dp[][]表示到当前节点的路径和
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i ++) dp[i][0] = grid[i][0] + dp[i-1][0];
        for (int j = 1; j < n; j ++) dp[0][j] = grid[0][j] + dp[0][j-1];

        for (int i = 1; i < m; i ++){
            for (int j = 1; j < n; j ++){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] array = {{1,2},{1,1}};
        System.out.println(minPathSum(array));
    }
}
