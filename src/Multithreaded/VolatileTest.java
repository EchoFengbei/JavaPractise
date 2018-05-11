package Multithreaded;

class Test {
    static  int i = 0, j = 0;
    public static void one() {
        i++;
        j++;
    }
    public static void two() {
        System.out.println("i=" + i + " j=" + j);
    }
}
public class VolatileTest {
    public static void main(String[] args) {
        Test test = new Test();
        /*五个线程执行one()*/
        for (int i = 0; i < 100; i++){
            new Thread(){
                @Override
                public void run() {
                    test.one();
                }
            }.start();
        }
        /*5个线程执行two()*/
        for (int i = 0; i < 100; i ++){
            new Thread(){
                @Override
                public void run() {
                    test.two();
                }
            }.start();
        }
    }
}
