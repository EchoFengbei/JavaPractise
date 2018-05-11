package ch2;

import java.util.Stack;

class BinaryTreeNode{
    String data;//节点数据
    BinaryTreeNode left;//左子树
    BinaryTreeNode right;//右子树

    //初始化，二叉树中只存在一个根节点
    void initialize( String data){
        BinaryTreeNode btNode;
        if ((btNode = new BinaryTreeNode())!= null){
            //分配节点成功
            btNode.data = data;
            btNode.left = null;
            btNode.right = null;
        }
    }
    BinaryTreeNode search(BinaryTreeNode treeNode,String str){
        //treeNode代表当前链表二叉树
        if (treeNode == null){
            return null;
        }else {
            //比较父节点
            if (treeNode.data.equals(str)){
                return treeNode;
            }else {
                //比较左子树
//                if (treeNode.right.data.equals(str)){
//                    return  treeNode.right;
//                }
                //上面写的太复杂了，直接调用search函数
                BinaryTreeNode pre = search(treeNode.left,str);
                if (pre != null){
                    return pre;
                }else {
                    //比较右子树
                    BinaryTreeNode post = search(treeNode.right,str);
                    if (post != null){
                        return post;
                    }else return null;
                }
            }
        }
    }

    //参数为treeNode表示该二叉树，要插入节点的数据，用来查找要插入的位置,flag为0表示
    //为左孩子节点，flag为1表示为右孩子节点
    //通过关键字查找到要插入的位置，即查找到要插入节点的父节点，再指定要插入的节点是左子树还是右子树
    //书上的节点数据都是键盘输入，这里都改为直接传参
    void insert(BinaryTreeNode treeNode,String str,String newData,int flag){
        //
        BinaryTreeNode parent = new BinaryTreeNode();
        BinaryTreeNode btNode = new BinaryTreeNode();//parent是父节点，btNode是分配的用来装载新节点数据，即新节点
        if (btNode != null){
            parent = search(treeNode,str);//通过str查找要插入的位置
            if (parent != null){
                //如果找到要插入的位置
                if (flag == 0){
                    //指定为左孩子节点
                    parent.left = btNode;
                    btNode.data = data;
                }
                if (flag == 1){
                    //指定为右孩子节点
                    parent.right = btNode;
                    btNode.data = data;
                }
            }
        }
    }
    //删除节点设计树的重新调整
    void delete(){
        //没有实现
    }

    //计算二叉树的深度
    int treeDepth(BinaryTreeNode treeNode){
        if (treeNode == null){
            return  0;
        }else {
            //递归计算左右子树的深度
            int depleft = treeDepth(treeNode.left);
            int depright = treeDepth(treeNode.right);
            if (depleft > depright){
                return depleft + 1;
            }else return depright +1;
        }
    }
    //层序遍历，使用一个顺序循环队列，当当前根节点不为空时，进队；判空，出队，出队的时候，访问数据，达到层序遍历的目的
    void levelTraverse(BinaryTreeNode treeNode){
        BinaryTreeNode btNode = new BinaryTreeNode();
        //初始化顺序队列
        int MaxNum = 100;
        BinaryTreeNode [] btQueue = new BinaryTreeNode[MaxNum];
        int head = 0;
        int tail =0;

        //处理根节点，入队
        if (treeNode != null){
            btQueue[tail] = treeNode;
            tail = (tail+1)%MaxNum;
        }
        //判空，出队，读取根节点数据
        while (head != tail){
            //显示当前队头也就是根节点的数据
            System.out.println("the data is " + btQueue[head].data);
            head = (head+1)%MaxNum;

            btNode = treeNode;
            if (btNode.left != null){
                btQueue[tail] = btNode.left;
                tail = (tail+1)%MaxNum;
            }
            if (btNode.right != null){
                btQueue[tail] = btNode.right;
                tail = (tail+1)%MaxNum;
            }
        }
    }
    //先序遍历，先根，左孩子，右孩子,递归
    void DLRTraverse(BinaryTreeNode treeNode){
        if (treeNode != null){
            System.out.println(treeNode.data);//先读数据
            DLRTraverse(treeNode.left);//再遍历左子树
            DLRTraverse(treeNode.right);//再遍历右子树
        }
    }
    //非递归的先根遍历，使用栈
    //如果p非空，说明指向某个节点
    //如果p空，栈也非空，说明某一条路径已经走完，则须返回寻找另一条路径，
    // 而此时返回的结点恰恰是刚才经过的最后一个结点，它已保存在栈顶，因此出栈该结点，赋值给p，再遍历p的右子树。
    String preTraverse(BinaryTreeNode treeNode){
        StringBuffer sb = new StringBuffer();//用来连接字符串
        Stack<BinaryTreeNode> stack = new Stack<>();//用于存放节点的栈

        BinaryTreeNode p = treeNode;//栈的指针指向根节点
        while (p != null || !stack.empty()){
            if (p!=null){
                //访问该节点
                sb.append(p.data);
                //访问完以后，压栈
                stack.push(p);
                //向下接着寻找
                p = p.left;
            }else {
                //栈为空，说明已经遍历完一条路径，从栈中出栈节点数据
                stack.push(p);
                p = p.right;//栈接着寻找右子树的节点
            }

        }
        return sb.toString();
    }

    //中序遍历，先左孩子，根节点，右孩子，递归
    void LDRTraverse(BinaryTreeNode treeNode){
        if (treeNode != null){
            LDRTraverse(treeNode.left);
            System.out.println(treeNode.data);
            LDRTraverse(treeNode.right);
        }
    }
    //① 若p不为空，表示刚刚到达p结点，由于是中根遍历，不能先访问根结点，直接将p入栈，继续进入p左子树，直到p为null。
    //②若p为空但栈不为空，表示已走完一条路径，则需要返回寻找另一条路径，而返回结点就是刚才经过的最后一个结点，它已保存在栈顶，所以出栈一个结点，使p指向它，并访问该结点，再进入p的右子树
    String midTraverse(BinaryTreeNode treeNode){
        StringBuffer sb = new StringBuffer();//用来连接字符串
        Stack<BinaryTreeNode> stack = new Stack<>();//用于存放节点的栈

        BinaryTreeNode p = treeNode;//栈的指针指向根节点
        while (p != null || !stack.empty()){
            while (p!=null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.empty()){
                p = stack.pop();
                sb.append(p.data);//c出栈后读节点数据
                p = p.right;
            }
        }
        return sb.toString();
    }

    //后序遍历，先左孩子，右孩子，根节点，遍历
     void LRDTraverse(BinaryTreeNode treeNode){
        if (treeNode != null){
            LRDTraverse(treeNode.left);
            LRDTraverse(treeNode.right);
            System.out.println(treeNode.data);
        }
     }


     //① 若p不为空，表示刚刚到达p结点，由于是中根遍历，不能先访问根结点，直接将p入栈，继续进入p左子树,右子树，直到p为null。
    //②若p为空但栈不为空，表示已走完一条路径，则需要返回寻找另一条路径，而返回结点就是刚才经过的最后一个结点，它已保存在栈顶，所以出栈一个结点，使p指向它，并访问该结点，再进入p的右子树
    String postTraverse(BinaryTreeNode treeNode){
        StringBuffer sb = new StringBuffer();//用来连接字符串
        Stack<BinaryTreeNode> stack = new Stack<>();//用于存放节点的栈

        BinaryTreeNode p = treeNode;//栈的指针指向根节点
        while (p != null || !stack.empty()){
            while (p!=null){
                stack.push(p);
                p = p.left;
            }
            if (!stack.empty()){


            }
        }
        return sb.toString();
    }

}
public class BinaryTree {
    public static void main(String[] args) {
        //the main function is empty.
    }

}
