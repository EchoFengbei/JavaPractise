package LeetCode.niuke.dongtaiguihua;

import java.util.Set;

public class wordBreakTest {
    public static boolean wordBreak(String s, Set<String> dict) {

        //新建一个boolean数组，存放之前的已经判断好的
        boolean[] canSegment = new boolean[s.length()];

        canSegment[0] = true;

        for (int i = 1; i < s.length(); i ++){
            for (int k = 0; k < i; k ++){
                canSegment[i] = canSegment[k] && dict.contains(s.substring(k+1,i+1));
                if (canSegment[i]) break;
            }
        }
        return canSegment[s.length()-1];
    }

    public static void main(String[] args) {
        System.out.println(wordBreak("a",null));
    }
}
