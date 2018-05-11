package niuke.jvli;

import java.util.Stack;

public class IsPopOrderTest {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        //参数1是压入栈的顺序，序列2是弹出栈的顺序
        Stack<Integer> stack = new Stack<>();
        int j = 0;//用来标记popB的位置
        if (pushA.length == 0 && popA.length ==0) return true;
        for (int i = 0; i < pushA.length; i ++){
            stack.push(pushA[i]);
            //如果栈不为空且栈顶元素等于出栈序列元素，则出栈
            while (!stack.empty() && stack.peek() == popA[j]){
                stack.pop();
                j ++;
            }
        }
        return stack.empty();
    }
}
