package ch2;
//准备数据，stack也采用结构体
class StackData{
    int StuId;
    String StrName;
    float Score;
}
class StackNode{
    //顺序栈，使用顺序表实现；链式栈暂时没有实现，以后有时间再搞
    int MaxNum = 100;//栈的最大长度
    StackData[] nodeData = new StackData[MaxNum+1]; //栈的数据部分
    int top; //栈顶,位置index

    //参数代表当前栈
    void initialize(StackNode sNode){
        sNode.top = 0;
    }

    Boolean isEmpty(StackNode sNode){
       if (sNode.top == 0){
           return true;
       }else return false;
    }

    Boolean isFull(StackNode sNode){
        if (sNode.top == sNode.MaxNum){
            return true;
        }else return false;
    }

    //清空栈
    void clear(StackNode sNode){
        sNode.top = 0;
    }
    //释放空间,栈初始化de时候，使用malloc函数分配内存空间，清空栈没有释放栈的内存
    void free(StackNode sNode){
        sNode = null;
    }

    //入栈
    void push(StackNode sNode,StackData sData){
        if (isFull(sNode)){
            System.out.println("overflow!!!");
        }
        sNode.nodeData[sNode.top] = sData;   //push进来的数据放在栈顶
        sNode.top ++;
    }
    //出栈
    void pop(StackNode sNode){
        if (isEmpty(sNode)) {
            System.out.println("stack is empty,can not pop");
        }
        sNode.nodeData[sNode.top] = null;
        sNode.top --;
    }
}
public class StackTest {
    public static void main(String[] args) {
        //主函数没有实现
    }
}
