package niuke.shijianxiaolv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintMinNumberTest {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        String res = "";
        for (int i = 0; i < numbers.length; i ++){
            list.add(numbers[i]);
        }
        //比较
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String str1 = o1 + "" + o2;
                String str2 = o2 + "" + o1;
                 return str1.compareTo(str2);
            }
        });
        for (int j : list){
            res = res + j;
        }
        return res;
    }
}
