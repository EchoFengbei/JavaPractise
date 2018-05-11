package Multithreaded;

class MyThread extends Thread{
    private static int num = 0;

    public MyThread(){
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i ++){
            num ++;
        }
        System.out.println("此时num =:" + num);
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++){
            MyThread thread = new MyThread();
            thread.start();
        }
    }
}
