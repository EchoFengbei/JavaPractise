package niuke.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindMaxInWindow {
    static ArrayList<Integer> res = new ArrayList<>();
    public static ArrayList<Integer> maxInWindows(int [] num, int size) {
//        int max = -1;
//        if(num == null) return null;
//        for(int i = 0; i < num.length-size+1; i ++){
//            for(int j = i; j < i+size-1;j++){
////                if(num[j] > num[j+1]){
////                   max = num[j];
////                }else{
////                    max = num[j+1];
////                }
//            }
//            res.add(max);
//        }
//        return res;
        //使用队列
        if (num == null) return res;
        if (num.length < size || size < 1) return res;
        //滑动窗口内部
        LinkedList<Integer> indexDeque = new LinkedList<>();
        for (int i = 0; i< size-1; i ++){
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]){
                indexDeque.removeLast();  //移除队列中的元素，因为有比队前面的值大的元素入队
            }
            indexDeque.addLast(i);  //将当前的较大值入队
        }

        //滑动整个窗口
        for (int j = size-1; j < num.length; j ++){
            while (!indexDeque.isEmpty() && num[j] > num[indexDeque.getLast()]){
                indexDeque.removeLast();
            }
            indexDeque.add(j);
            if(j - indexDeque.getFirst() + 1 > size){
                indexDeque.removeFirst();
            }
            res.add(num[indexDeque.getFirst()]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {2,3,4,2,6,2,5,1};
        int n = 3;
        System.out.println(maxInWindows(num,n));
    }
}
