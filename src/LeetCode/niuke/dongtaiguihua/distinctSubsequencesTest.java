package LeetCode.niuke.dongtaiguihua;

public class distinctSubsequencesTest {
    public int numDistinct(String S, String T) {
        int n = S.length();//列数
        int m = T.length();//行数
        int[][] dp = new int[m+1][n+1];

        dp[0][0] = 1;
        for (int i = 0; i < n+1; i ++) dp[0][i] = 1;

        for (int i = 1; i < m+1; i ++){
            for (int j = 1; j < n+1; j ++){
                if (S.charAt(j-1) == T.charAt(i-1)){
                    dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
                }else dp[i][j] = dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}
