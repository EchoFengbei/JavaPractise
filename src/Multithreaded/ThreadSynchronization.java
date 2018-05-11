package Multithreaded;

/*
* 我们希望output方法被一个线程完整的执行完之后再切换到下一个线程，Java中使用synchronized保证一段代码在多线程执行时是互斥的
* 有两种实现办法：1. 使用synchronized将需要互斥的代码包含起来，并上一把锁。
*  2. 将synchronized加在需要互斥的方法上。*/
class Outputter {
    public void output(String name) {
        // TODO 为了保证对name的输出不是一个原子操作，这里逐个输出name的每个字符
//        这是最原始的问题提出，会出现线程不同步的问题
//        for(int i = 0; i < name.length(); i++) {
//            System.out.print(name.charAt(i));
//            // Thread.sleep(10);
//        }
        /*1.使用第一种方法，加锁，实现同步
        * 这把锁必须是需要互斥的多个线程间的共享对象*/
        synchronized (this){
            for (int i = 0; i < name.length(); i ++){
                System.out.print(name.charAt(i));
            }
        }
    }
    /*2. 将synchronized加在需要互斥的方法上。*/
    public synchronized void output2(String name){
        for (int i = 0; i < name.length(); i ++){
            System.out.print(name.charAt(i));
        }
    }
}
public class ThreadSynchronization {
    /*期待的输出是zhangsanlisi,但是真实输出的时候会出现不同的结果，这是因为没有保证两个线程的顺序，所以会出现这样的问题*/
    public static void main(String[] args) {
        final Outputter output = new Outputter();
        new Thread() {
            public void run() {
                output.output("zhangsan");
            }
        }.start();
        new Thread() {
            public void run() {
                output.output("lisi");
            }
        }.start();
    }
}
