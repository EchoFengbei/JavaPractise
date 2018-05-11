package niuke.zongheAndhuisu;

import com.sun.org.apache.bcel.internal.generic.IADD;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.TreeMap;

public class hasPathInMatrix {
    private char[][] data;
    private  boolean res = false;
    private boolean isVisited = false;
    //path不可以用Character，因为路径上的字符可能会有重复，要用唯一性的Integer（即在matrix中的位置），二维数组太麻烦了
    private LinkedList<Integer> path = new LinkedList<Integer>();
    private int rows,cols;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

        this.rows = rows;
        this.cols = cols;

        //将一维是我matrix转换为二维数组
        data = new char[rows][cols];

        for (int i = 0 ,k = 0; i < rows; i ++){
            for (int j = 0 ; j < cols; j ++){
                data[i][j] = matrix[k++];
            }
        }
        //以后就在data[][]数组中进行操作
        //找到第一个字符的位置
        int r,c;
        for (int i = 0; i < matrix.length; i ++){
            if (matrix[i] == str[0] && !isVisited){
                //进行访问操作，记录此时的位置
                r = i / cols;
                c = i % cols;
                isPath(r,c,str,0);
            }
        }
        return  res;
    }
    public void isPath(int r, int c, char[] str, int index){
        //index是比较字符数组中的索引
        if (isVisited) return;
        if (path.contains(r*cols+c)) return;

        path.addLast(r*cols+c);
        if (index == str.length-1){
            isVisited = true;
            res = true;
        }else{
            //上下左右进行搜索
            for (int i = 0; i < 4; i ++){
                switch (i){
                    case 0://向上寻找
                        if ((r-1)>=0 && data[r-1][c] == str[index +1]){
                            isPath(r-1,c,str,index+1);
                        }
                        break;
                    case  1://向下寻找
                        if ((r+1)< rows && data[r+1][c] == str[index +1]){
                            isPath(r+1,c,str,index+1);
                        }
                        break;
                    case 2://向左寻找
                        if ((c-1)>=0 && data[r][c-1] == str[index+1]){
                            isPath(r,c-1,str,index+1);
                        }
                        break;
                    case 3://向右寻找
                        if ((c+1)<cols && data[r][c+1] == str[index+1]){
                            isPath(r,c+1,str,index+1);
                        }
                        break;
                }
            }
        }
        path.removeLast();
    }
}
