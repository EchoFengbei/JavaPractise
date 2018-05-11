package LeetCode.niuke.dongtaiguihua;

import java.util.Arrays;

public class scrambleString {
    //递归
    public static boolean isScramble(String s1, String s2) {
        //长度上比较
        if (s1.length() != s2.length()) return false;
        if (s1.length() == 1 || s2.length() == 1) return s1.equals(s2);
        //内容上比较
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i ++){
            if (chars1[i] != chars2[i]) return false;
        }
        //将两个字符串分割，分别对比
        for (int i = 1; i < chars1.length; i ++){
            String s1left = s1.substring(0,i);
            String s1right = s1.substring(i);
            String s2left = s2.substring(0,i);
            String s2right = s2.substring(i);
            if (isScramble(s1left,s2left) && isScramble(s1right,s2right)) return true;
            s2left = s2.substring(0,s2.length()-i);
            s2right = s2.substring(s2.length()-i);
            if (isScramble(s1left,s2right) && isScramble(s1right,s2left)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isScramble("aa","aa"));
    }
}
