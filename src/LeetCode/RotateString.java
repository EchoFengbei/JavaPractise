package LeetCode;

import javax.swing.*;

public class RotateString {
    public static boolean rotateString(String A, String B) {
//        //使用循环队列实现
//        boolean flag = false;
//        char[] aChars = A.toCharArray();
//        char[] chars = new char[aChars.length];//循环队列
//        int head = 0;
//        int tail = 0;
//        //循环入队，将A的所有字符送入到循环队列中,先填满队列
//        for (int i=0; i<A.length(); i++){
//            chars[tail] = aChars[i];
//            tail = (tail+1) % aChars.length;
//        }
//        for (int j=0; j<A.length(); j++) {
//            char element = chars[head];
//            head = (head + 1) % aChars.length;
//
//            tail = (tail+1) % aChars.length;
//            chars[tail] = element;
//
//
//            while (chars.toString().equals(B)){
//                flag = true;
//                return flag;
//            }
//        }
//        return flag;



        ///发现并不能用循环队列做，因为添加的元素和队列的长度一样长，这样就使循环队列变成了一个普通的队列，并不能实现。
        //这是别人做的
        return A.length() == B.length() && (A + A).contains(B);
    }
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
}
