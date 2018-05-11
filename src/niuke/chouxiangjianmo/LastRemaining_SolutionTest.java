package niuke.chouxiangjianmo;

import java.util.ArrayList;

public class LastRemaining_SolutionTest {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0 || m == 0) return -1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i ++){
            list.add(i);
        }
        int temp = (m-1)%list.size();//要清除的索引
        while (list.size() != 1){
            list.remove(temp);
            temp = (temp + (m - 1))%list.size();//接下来要删除的元素索引
        }
        return list.get(0);
    }
}
