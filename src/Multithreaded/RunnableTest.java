package Multithreaded;

/*开了100个线程，每个线程实现100的加法，最后应该返回10000，但是基本没有，多线程不安全的问题*/
class MyRunnable implements Runnable{
    private static int num = 0;
    public MyRunnable(){

    };
    @Override
    public void run() {
        for (int i = 0; i < 100; i ++){
            num ++;
        }
        System.out.println("num = :" + num);
    }
}
public class RunnableTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++){
            MyRunnable myRunnable = new MyRunnable();
            new Thread(myRunnable).start();
        }
    }
}
