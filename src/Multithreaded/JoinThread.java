package Multithreaded;

public class JoinThread extends Thread {
    public JoinThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i ++){
            System.out.println(getName() + "  " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new JoinThread("JoinThread").start();
        for (int i = 0; i < 10; i ++){
            if (i == 5) {
                JoinThread th = new JoinThread("joined thread");
                th.start();
                th.join();
            }
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}
