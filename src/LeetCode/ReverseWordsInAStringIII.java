package LeetCode;

import java.awt.*;

public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        StringBuffer newStr = new StringBuffer(); //StringBuffer的初始化
        String[] temp = s.split(" ");//将字符串按照空格分割，返回一个字符串数组
        for(String str :temp) {
            newStr.append(new StringBuffer(str).reverse());
            newStr.append(" ");
        }
        newStr.setLength(newStr.length()-1);//删除最后一个空格
        return newStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
