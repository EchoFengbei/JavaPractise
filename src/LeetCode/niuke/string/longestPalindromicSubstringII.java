package LeetCode.niuke.string;

public class longestPalindromicSubstringII {
    public String longestPalindrome(String s) {
        //动态规划
        if (s == null || s.length() == 0) return "";
        boolean dp[][] = new boolean[s.length()][s.length()];
        int maxLen = 0;
        String res = "";
        for (int i = s.length();i >= 0; i --){
            for (int j = i; j < s.length(); j ++){
                if ((s.charAt(i) == s.charAt(j)) && (j - i <= 2 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    if (maxLen < j-i+1){
                        maxLen = j-i+1;
                        res = s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
}
