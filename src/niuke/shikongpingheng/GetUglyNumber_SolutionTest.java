package niuke.shikongpingheng;

import java.util.ArrayList;

public class GetUglyNumber_SolutionTest {
    public int GetUglyNumber_Solution(int index) {
//        return 0;
        if (index <= 0) return -1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        while (list.size() <= index){
            int n2 = list.get(i2)*2;
            int n3 = list.get(i3)*3;
            int n5 = list.get(i5)*5;
            int min = Math.min(n2,Math.min(n3,n5));
            list.add(min);
            if (n2 == min) i2++;
            if (n3 == min) i3++;
            if (n5 == min) i5++;
        }
        return list.get(list.size());
    }
}
