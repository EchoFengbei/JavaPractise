package niuke.digui;

import java.util.ArrayList;

public class FibonacciNumber {
    public int Fibonacci(int n) {
//        int res = 0;
//        if(n == 1 || n == 2){
//            res = 1;
//            return res;
//        }
//        if(n > 2){
//            res = Fibonacci(n-1) + Fibonacci(n-2);
//        }
//        return res;

        //使用循环
       int preNum = 1;
       int prePreNum = 1;
       int res = 0;
       if (n <= 0) return 0;
       if (n == 1 || n ==2) return 1;
       for (int i = 3; i <  n; i++){
           res = preNum +prePreNum;
           prePreNum = preNum;
           preNum = res;
       }
       return res;
    }
}
