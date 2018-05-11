package LeetCode.niuke.dongtaiguihua;

import java.util.ArrayList;
import java.util.Arrays;

public class grayCodeTest {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i <(1<<n); i ++){
            res.add((i>>1)^i);
        }
        return res;
    }
public static void main(String[] args) {
    System.out.println(1<<2);
}
}
