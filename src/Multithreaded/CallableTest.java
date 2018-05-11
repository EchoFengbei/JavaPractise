package Multithreaded;

import java.util.ArrayList;
import java.util.concurrent.*;

class TaskWithResult implements Callable{
    private int result;
    //求斐波那切数列
    public int Fibonacci(int num){
        int res = -1;
        if (num == 1){
            res = 1;
        }
        if (num == 2){
            res = 1;
        }
        if (num > 2){
            res = Fibonacci(num-1) + Fibonacci(num-2);
        }
        return res;
    }
    public TaskWithResult(int result){
        this.result = Fibonacci(result);
    }
    @Override
    public String call() throws Exception {
        return "the result of Fibonacci is :" + result;
    }
}
public class CallableTest {
    public static void main(String[] args) {
        ExecutorService exe = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();

        for (int i = 1; i < 10; i ++){
            results.add(exe.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs : results){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            }finally {
                exe.shutdown();
            }
        }
    }
}
