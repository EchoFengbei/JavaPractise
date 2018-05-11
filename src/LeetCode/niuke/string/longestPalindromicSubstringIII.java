package LeetCode.niuke.string;

public class longestPalindromicSubstringIII {
    public static String longestPalindrome(String s){
        String res = null;
        int len = 0;
        for (int i = 0; i < s.length(); i ++){
            for (int j = i + 1; j < s.length(); j ++){
                String string = s.substring(i,j+1);
                if (isPalindrome(string)){
                    if (j-i > len){
                        len = j - i;
                        res = string;
                    }
                }
            }
        }
        return res;
    }
    public static boolean isPalindrome(String string){
        for (int i = 0; i < string.length()-1; i ++){
            if (string.charAt(i) != string.charAt(string.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbas"));
    }
}
