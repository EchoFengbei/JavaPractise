package LeetCode.niuke.dongtaiguihua;

public class decodeWaysTest {
    public static int numDecodings(String s) {
        if (s ==null || s.length()==0 || s.charAt(0)=='0') return 0;
     //建立一个dp数组，长度比String数组多一个，用来表示可能存在的编码个数
        //递推公式：如果当前字符可以分为一个(即在1-9之间)，dp[i] = dp[i] + dp[i-1];
        //如果当前字符可以和前面一个组成两位数（即在10-26之间），dp[i] = dp[i] + dp[i+2]
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= s.length(); i ++){
            if (s.charAt(i-1)>='1' && s.charAt(i-1)<='9'){
                dp[i] = dp[i] + dp[i-1];
            }
            if ((Integer.parseInt(s.substring(i-2,i)) >= 10) &&
                    (Integer.parseInt(s.substring(i-2,i)) <= 26)){
                dp[i] = dp[i] + dp[i-2];
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("10"));
    }
}
