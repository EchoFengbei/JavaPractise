package LeetCode.niuke.fenzhi;

public class SqrtxTest {
    //使用二分法，在【1，x/2】的范围内进行查找
    public static int sqrt(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            long mid = (low + high) / 2;
            if(mid * mid == x) return (int)mid;
            else if(mid * mid < x) low = (int)(mid + 1);
            else high = (int)(mid - 1);
        }
        return high;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(100000000));
    }
}
