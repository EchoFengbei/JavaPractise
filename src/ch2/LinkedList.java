package ch2;

class LLData{
    int StuId;
    String StuName;
    float StuScore;
}
class LLNode{
    //链表包括两部分：数据部分（node）和地址部分（下个节点的地址）
    LLData nodeData = new LLData();
    LLNode nextNode;

    //尾部追加节点(当前链表(head代表)，要添加的节点(数据)
    void endAdd(LLNode head,LLData newData){
        //通过node遍历，首先从head开始
        LLNode node = head;
        //循环找到当前链表的表尾(要操作的节点)
        LLNode newEnd = new LLNode();
        while (node.nextNode == null){
            node.nextNode = newEnd;
            newEnd.nodeData = newData;
            newEnd.nextNode = null;
        }
    }
    void headAdd(LLNode head,LLData newData){
        LLNode newFirst = new LLNode();
        //两种情况，一种只有head，一种有整个链表
        //第一种，链表中只有head时
        if (head.nextNode == null){
            head.nextNode = newFirst;
            newFirst.nodeData = newData;
            newFirst.nextNode = null;
        }else {
            //第二种，链表中有其他元素时
            newFirst.nextNode = head.nextNode;
            head.nextNode = newFirst;
            newFirst.nodeData = newData;
        }
    }
    LLNode searchByCont(LLNode head, String name){
        LLNode node = new LLNode();
        node = head;
        while (node.nextNode != null){
            if (node.nodeData.equals(name)){
                return node;
            }
            node = node.nextNode;
        }
        return null;//搜索到最后一个节点
    }
    void insert(LLNode head, String name, LLData nodeData){
        LLNode newNode = new LLNode();
        LLNode temp;
        temp = searchByCont(head,name);
        if (temp!= null){
            newNode.nextNode = temp.nextNode;
            temp.nextNode = newNode;
            newNode.nodeData = nodeData;
        }
    }
    void delete(LLNode head,String name){
        LLNode preNode = new LLNode();  //保存搜索到的节点的前一个节点
        LLNode temp;
        temp = searchByCont(head,name);
        while (temp != null){
            if (temp != null){
                preNode.nextNode = temp.nextNode;
                temp = null; //删除的时候一定要释放删除节点的内存
            }
            else {
                preNode = temp;
                temp = temp.nextNode;//保证了preNode是temp的前一个节点
            }
        }
    }
    //附属的功能
    int length(LLNode head){
        int len = 0;
        LLNode node ;
        node = head;
        while (node != null){
            len ++;
            node = node.nextNode;
        }
        return len;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        //主函数没有写
    }
}
