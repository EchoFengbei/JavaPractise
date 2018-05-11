package LeetCode;

public class ReverseString {
    public static String reverseString(String s) {
//        return new StringBuffer(s).reverse().toString();
        int head = 0, tail = s.length() - 1;
        char[] ch = new char[s.length()];
        while(head <= tail) {
            ch[head] = s.charAt(tail);
            ch[tail--] = s.charAt(head++);
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));

    }
}
