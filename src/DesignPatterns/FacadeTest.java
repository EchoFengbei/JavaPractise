package DesignPatterns;

/*
* 外观模式：将多个类通过一个类的构造方法连接起来
* 降低类与类之间的耦合，类似于Spring之前的类与类之间的配置文件
* 外观模式中使用类，连接两个有关联的类*/
class CPU{
  public void startup(){
      System.out.println("cpu is startup");
  }
  public void shutdown(){
      System.out.println("cpu is shutdown");
  }
}
class Memory {
    public void startup(){}
    public void shutdown(){}
}
class Computer{
    private  CPU cpu;
    private  Memory memory;

    public  Computer(){
        cpu = new CPU();
        memory = new Memory();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        System.out.println("start computer finished!");
    }
    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        System.out.println("computer closed!");
    }


}

//这个类是一个计算机启动的功能
public class FacadeTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
