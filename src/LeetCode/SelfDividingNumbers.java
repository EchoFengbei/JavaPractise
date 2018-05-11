package LeetCode;

import javafx.stage.PopupWindow;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right){
        List list = new ArrayList<Integer>();
        for (int i = left, n = 0; i <= right; i++) {
            for (n = i; n > 0; n /= 10)
                if (n % 10 == 0 || i % (n % 10) != 0) break;
            if (n == 0) list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1 = selfDividingNumbers(1,22);
        for (int i = 0;i < list1.size();i ++){
            System.out.println(list1.get(i));
        }

    }
}
