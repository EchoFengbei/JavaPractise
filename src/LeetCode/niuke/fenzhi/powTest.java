package LeetCode.niuke.fenzhi;

public class powTest {
    public static double pow(double x, int n) {
        if (n > 0) return powHelper(x,n);
        else return 1/powHelper(x,-n);

    }
    public static double powHelper(double x,int n){
        if (n == 0) return 1;
        double half = powHelper(x,n/2);
        if (n%2 == 0) return half*half;
        else return half*half*x;
    }

    public static void main(String[] args) {
        System.out.println(pow(2,5));
}
}
