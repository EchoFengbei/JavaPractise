package ch2;

import java.util.Scanner;


     class Node{
        int StuId;
        String StuName;
        float Score;
      }
     class SLType {
         int MaxNum = 100;
         Node[] sequenceList = new Node[MaxNum];
         int lenSeqList;    //已经保存的节点的长度


         int length(SLType slType) {
             return slType.lenSeqList;
         }

         int initialize() {
             //调用内部类SLType中的变量，要重新new一个对象，通过对象指向该变量
             SLType slType = new SLType();
             return slType.lenSeqList = 0;
         }

         //通过节点的位置插入，传参//插入判满
         Node[] insert(SLType slType, int pos, Node node) {
             if (slType.lenSeqList == slType.MaxNum) {
                 System.out.println("当前顺序表已满，不能插入");
             }
             if (pos < 0 || pos > slType.lenSeqList) {
                 System.out.println("要插入的节点下标越界");
             }
             //否则，插入节点，插入节点的逻辑要从后往前移动
             for (int i = slType.lenSeqList ; i >= pos; i --) {
                 slType.sequenceList[i + 1] = slType.sequenceList[i];
             }
             slType.sequenceList[pos] = node;
             slType.lenSeqList++;   //竟然忘记写长度增加了
             return slType.sequenceList;
         }
         int add(SLType slType,Node node){
             if (slType.lenSeqList >= MaxNum){
                 System.out.printf("顺序表已满");
                 return  0;
             }
             slType.sequenceList[lenSeqList] = node;
             return 1;
         }
         //通过节点的位置删除 // 删除判空
         Node[] delete(SLType slType, int pos) {
             if (slType.lenSeqList == 0) {
                 System.out.println("当前顺序表为空，不能删除");
             }
             if (pos < 0 || pos > slType.lenSeqList) {
                 System.out.println("要删除的节点下标越界");
             }
             for (int i = pos; pos < slType.lenSeqList; pos++) {
                 slType.sequenceList[i] = slType.sequenceList[i + 1];
             }
             slType.lenSeqList--;
             return slType.sequenceList;
         }

         //通过位置查找
         Node searchByPos(SLType slType, int pos) {
             if (pos < 0 || pos > slType.lenSeqList) {
                 System.out.println("要查找的节点下标越界");
             }
             return slType.sequenceList[pos];
         }

         //通过节点内容,例如学生名字，查找
         Node searchByCont(SLType slType, String str) {
             Node searchNode = new Node();
             for (int i = 0; i < slType.lenSeqList-1; i++) {
                 if (!slType.sequenceList[i].StuName.equals(str)) {
                     System.out.println("要查找的节点不在顺序表中");
                     break;
                 } else {
                     searchNode = slType.sequenceList[i];
                     System.out.println("要查找的节点在顺序表中");
                     System.out.printf("(%d,%s,%f)\n",slType.sequenceList[i].StuId,
                             slType.sequenceList[i].StuName,slType.sequenceList[i].Score );
                     break;
                 }
             }
             return searchNode;
         }

         //显示所有的节点
         void showNode(SLType slType){
//             System.out.println(slType.lenSeqList);
             for (int i = 0; i < slType.lenSeqList;i ++){
                 System.out.printf("(%d,%s,%f)\n",slType.sequenceList[i].StuId,
                         slType.sequenceList[i].StuName,slType.sequenceList[i].Score );
             }
         }
     }
public class SequenceList {
    public static void main(String[] args) {
        SLType slType = new SLType();
        Node nData = new Node() ;    //要操作的节点
        String string;   //要操作的字符
        int pos;     //要操作的节点位置
        System.out.println("开始你的表演！！！！！");

        //开始操作
        System.out.println("开始初始化....");
        slType.initialize();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("输入的节点（序号 姓名 成绩）:\n");
            Node newNode = new Node();
            newNode.StuId = scanner.nextInt();
            newNode.StuName = scanner.next();
            newNode.Score = scanner.nextFloat();
            if (newNode.Score > 0){
                slType.add(slType,newNode);
                slType.lenSeqList++;
                if (slType.add(slType,newNode) == 0){
                    break;
                }
            }else {
                break;
            }
        }
//        //显示当前的节点
        System.out.println("输出当前顺序表中的节点");
        slType.showNode(slType);

        //插入节点   插入实现的时候有问题，一会解决
        System.out.println("输入要插入的节点的位置和内容(id,name,score)");
        pos = scanner.nextInt();
        nData.StuId = scanner.nextInt();
        nData.StuName = scanner.next();
        nData.Score = scanner.nextFloat();
        slType.insert(slType,pos,nData);
        System.out.println("输出当前顺序表中的节点");
        slType.showNode(slType);

        //按照位置查找节点
        System.out.println("输入要查找的节点的位置");
        pos = scanner.nextInt();
        System.out.println("查找的结果：");
        slType.searchByPos(slType,pos);
        System.out.printf("(%d,%s,%f)\n",slType.sequenceList[pos].StuId,slType.sequenceList[pos].StuName,slType.sequenceList[pos].Score);

        //按照内容查找节点
        System.out.println("输入要查找的节点的内容(name)");
        string = scanner.next();
        System.out.println("查找的结果：");
        slType.searchByCont(slType,string);


        //通过删除节点
        System.out.println("输入要删除的节点的index");
        pos = scanner.nextInt();
        System.out.println("删除节点以后");
        slType.delete(slType,pos);
        slType.showNode(slType);
    }
}

