package Multithreaded;

import java.util.ArrayList;
import java.util.List;

/*
* 生产者消费者问题
* 现有一个盘子，只能放一个鸡蛋，A放鸡蛋，B取鸡蛋*/
public class Plate {
    //定义盘子
    List<Object> plate = new ArrayList<>();
    //取鸡蛋，当盘子为空时，等待，并唤醒放鸡蛋进程
    public synchronized Object getEgg(){
        while (plate.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //否则，取鸡蛋
        Object egg = plate.get(0);
        plate.clear();//清空盘子
        notify();//唤醒放鸡蛋进程
        System.out.println("拿到鸡蛋");
        return egg;
    }
    //放鸡蛋
    public synchronized void putEgg(Object egg){
        while (plate.size() != 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //否则，放鸡蛋；
        plate.add(egg);
        notifyAll();//唤醒取鸡蛋线程
        System.out.println("放好鸡蛋");
    }
    //把两个方法放进线程
    static class PutThread implements Runnable{
        private Plate plate;
        private Object egg = new Object();

        public PutThread(Plate plate){
            this.plate = plate;
        }
        @Override
        public void run() {
            plate.putEgg(egg);
        }
    }
    static class GetThread implements Runnable{
        private Plate plate;

        public GetThread(Plate plate){
            this.plate = plate;
        }
        @Override
        public void run() {
            plate.getEgg();
        }
    }
    public static void main(String[] args) {
        Plate plate = new Plate();
        for (int i = 0; i < 1000; i ++){
            new Thread(new PutThread(plate)).start();
            new Thread(new GetThread(plate)).start();
        }
    }
}
