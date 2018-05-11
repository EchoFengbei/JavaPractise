package ch4;

public class SwapTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int temp;
//只是为了检测a,b的赋值顺序，结论，没有影响
//        temp = a;
//        a = b;
//        b = temp;
        temp = b;
        b = a;
        a = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
