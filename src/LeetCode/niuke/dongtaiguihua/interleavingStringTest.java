package LeetCode.niuke.dongtaiguihua;

public class interleavingStringTest {
    public static boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        if (len1 + len2 != len3) return false;

        boolean[][] dp = new boolean[len1+1][len2+1];
        dp[0][0] = true;
        //边界值
        //dp[i][j]表示若s3的前i+j个字符能够由s1前i个字符和s2的前j个字符交织而成
        for (int i = 1; i <= len2; i ++){
            dp[0][i] = dp[0][i-1] && s2.charAt(i-1) == s3.charAt(i-1);
        }
        for (int j = 1; j <= len1; j ++){
            dp[j][0] = dp[j-1][0] && s1.charAt(j-1) == s3.charAt(j-1);
        }
        //动态规划，s2中取0个s1中取i个 去和s3中0+i 个匹配
        /*
        状态转移方程：有两种情况
        第一个状态转移方程：
        dp[i][j]= {(dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)}
        dp[i-1][j]表示若s3的前i+j-1个字符能够由s1前i-1个字符和s2的前j个字符交织而成，
        那么只需要s1的第i个字符与s3的第i+j个字符相等（charAt索引从0开始），那么dp[i][j]=true;
        第二个状态转移方程：
        dp[i][j]= {(dp[i][j-1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)}
        dp[i-1][j]表示若s3的前i+j-1个字符能够由s1前i个字符和s2的前j-1个字符交织而成，
        那么只需要s2的第j个字符与s3的第i+j个字符相等（charAt索引从0开始），那么dp[i][j]=true;*/
        for (int i = 1; i <= len1; i ++){
            for (int j = 1; j <= len2; j ++){
                dp[i][j] = (dp[i-1][j] && (s1.charAt(i-1) == s3.charAt(i+j-1))) ||
                        (dp[i][j-1] && (s2.charAt(j-1) == s3.charAt(i+j-1)));
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println(isInterleave("a","","a"));
    }
}
