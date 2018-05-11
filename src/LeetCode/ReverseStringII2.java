package LeetCode;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.pow;

public class ReverseStringII2 {
    public static String reverseStr(String s, int k) {
        //下面用reverse函数进行翻转
        String output = "";
        StringBuffer result = null;
        while (s.length() >= 2 * k) {
            String temp = "";
            result = new StringBuffer(s.substring(0, k)).reverse();//处理前k个字符串，翻转，保存在result中
            String pre = s.substring(k, 2 * k);  //第[k,2*k)个不用翻转，保存在pre中
            temp = result.toString() + pre; //将处理好的前2*k个字符拼接起来，保存在output中，
            result.setLength(0);//
            s = s.substring(2 * k);
            output = output+temp;
        }
        if (s.length() <= k) {
            output =output+new StringBuffer(s).reverse().toString();
        } else if (s.length() < 2 * k) {
            output =output+new StringBuffer(s.substring(0, k)).reverse().toString() + s.substring(k);
        }
        return output;
    }

    public static void main(String[] args) {
        String test = "abcdefg";
        System.out.println(reverseStr(test, 1));
    }
}
