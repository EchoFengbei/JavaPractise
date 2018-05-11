package niuke.shijianxiaolv;

public class NumberOf1Between1AndN_SolutionTest {
    public int NumberOf1Between1AndN_Solution(int n) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for (int i = 1; i <= n; i ++){
            sb.append(i);
        }
        for (int i = 0; i < sb.length(); i++){
            if (sb.charAt(i)=='1') count ++;
        }
        return count;
    }
}
