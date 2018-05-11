package LeetCode.niuke.string;

import java.util.Stack;

public class simplifyPath {
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0) return "";
        String[] strings = path.split("/");
        //先将第一个栈元素弹出入栈到第二个栈，然后再利用第二个栈还原回初始path。
        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < strings.length; i ++){
            if (strings[i].equals(".") || strings[i].length()==0) continue;
            else if (!strings[i].equals("..")) stack1.push(strings[i]);
            else {
                if (!stack1.isEmpty()){
                    stack1.pop();
                }
            }
        }

        Stack<String> stack2 = new Stack<>();
        StringBuffer sb = new StringBuffer();
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        while (!stack2.isEmpty()){
            sb.append("/" + stack2.pop());
        }
        if (sb.length() == 0){
            sb.append("/");
        }
        return sb.toString();
    }
}
