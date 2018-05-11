package niuke.stackandqueue;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Stack;

public class TwosStackAsQueue{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    int res = -1;

    public void push(int node) {
        //入队
        //当stack2为空时
        stack1.push(node);
    }
    public int pop() {
        //出队
        if (stack2.empty()){
            while (!stack1.empty()){
                int temp = stack1.pop();
                stack2.push(temp);
            }
        }
        return  stack2.pop();
    }
}
