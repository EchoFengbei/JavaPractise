package ch2;

import com.sun.org.apache.bcel.internal.generic.NEW;

class QueueData{
    int StuId;
    String StuNme;
    float Score;
}
class QueueNode{
    int MaxNum = 100;//队列长度
    QueueData [] nodeData = new QueueData[MaxNum+1];
    int head; //队头
    int tail;//对尾

    void initialize(QueueNode qNode){
        qNode.head = qNode.tail = 0;
    }
    Boolean isEmpty(QueueNode qNode){
//        qNode.tail = 0;//这样不能判断队列是空
        if (qNode.head == qNode.tail){
            return  true;
        }else return false;
    }
    Boolean isFull(QueueNode qNode){
        if (qNode.tail == MaxNum){
            return true;
        }else return false;
    }
    void clear(QueueNode qNode){
        qNode.head = 0;
        qNode.tail = 0;
    }
    void free(QueueNode qNode){
        qNode = null;
    }
    //队尾入队，入队判满
    void in(QueueNode qNode,QueueData qData){
        if (isFull(qNode)){
            System.out.println("the queue is full, can not in");
        }else {
            qNode.tail++;
            qNode.nodeData[qNode.tail] = qData;
        }
    }

    //队头出队，出队判空
    void out(QueueNode qNode){
        if (isEmpty(qNode)){
            System.out.println("the queue is empty,can not out");
        }else {
            QueueData out = new QueueData();
            out = qNode.nodeData[qNode.head];  //读取节点内容
            qNode.head++;
        }
    }
    int length(QueueNode qNode){
        return qNode.tail-qNode.head;
    }
}
public class QueueTest {
    public static void main(String[] args) {
        //the main  function is empty
    }
}
