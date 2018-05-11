package LeetCode.niuke.string;

import java.util.Arrays;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        int len = Math.min(strs[0].length(),strs[strs.length-1].length());
        int i ;
        for (i = 0; i < len ;){
            if (strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                i ++;
            }else break;
        }
        return strs[0].substring(0,i);
    }

    public static void main(String[] args) {
        String[] str = {"a","abc"};
        System.out.println(longestCommonPrefix(str));
    }
}
