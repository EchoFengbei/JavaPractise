package Multithreaded;

/*
* 其实interrupt()方法并不是中断线程的执行，而是为调用该方法的线程对象打上一个标记，
* 设置其中断状态为true，通过isInterrupted()方法可以得到这个线程状态，*/
class MyInterruptThread extends Thread{
    private int i = 0;
    public MyInterruptThread(String name){
        super(name);
    }
    @Override
    public void run() {
        while(!isInterrupted()) {// 当前线程没有被中断，则执行
            System.out.println(getName() + getId() + "执行了" + ++i + "次");
        }
    }
}
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        MyInterruptThread thread = new MyInterruptThread("MyInterruptThread");
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}
