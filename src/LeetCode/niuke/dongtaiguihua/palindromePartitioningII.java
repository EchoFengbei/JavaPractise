package LeetCode.niuke.dongtaiguihua;

public class palindromePartitioningII {
    public int minCut(String s) {
        //使用二维数组保存回文状态，用一个二维数组isPalindrome存放是否为回文的状态，
        // 两层循环嵌套，i从后往前，j从i往后遍历，如果s[i]==s[j]，并且前一个状态，
        // 即isPalindrome[i+1][j-1]为真，那么isPalindrome[i][j]也为真。
        // 一维数组cut用来存放需要切分的次数，初始为字符串区域的长度
        int n = s.length();

        int[] cut = new int[n+1];
        for (int i = 0; i <= n; i ++){
            cut[i] = n - i;//表示，如果前[0,i]是回文，则则整个字符串需要切割的次数
        }
        boolean[][] isPalindrome = new boolean[n][n];
        for (int i = n-1; i > 0; i --){
            for (int j = i; j < n; j ++){
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || isPalindrome[i + 1][j - 1])){
                    isPalindrome[i][j] = true;
                    cut[i] = Math.min(cut[i],cut[j+1]+1);
                }
            }
        }
        return cut[0];
    }
}
