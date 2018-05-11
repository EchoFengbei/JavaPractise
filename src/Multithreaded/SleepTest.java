package Multithreaded;


public class SleepTest {
    static int i = 0;
    static class MySleepThread extends Thread{
        @Override
        public void run() {
            synchronized (new Object()){
                i ++;
                System.out.println("i:"+i);
                try {
                    System.out.println("线程"+Thread.currentThread().getName()+"进入睡眠状态");
                    Thread.currentThread().sleep(10000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
                System.out.println("线程"+Thread.currentThread().getName()+"睡眠结束");
                i++;
                System.out.println("i:"+i);
            }
        }
    }
    public static void main(String[] args) {
        MySleepThread thread1 = new MySleepThread();
        MySleepThread thread2 = new MySleepThread();
        thread1.start();
        thread2.start();
    }
}
