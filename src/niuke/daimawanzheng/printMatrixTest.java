package niuke.daimawanzheng;

import java.util.ArrayList;

public class printMatrixTest {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;
        int n = matrix.length;
        int m = matrix[0].length;
        int layer = (Math.min(n,m)-1)/2+1;
        for (int i = 0; i < layer; i ++){
            //处理第一行
            for (int k = i; k < m-i; k ++)  res.add(matrix[i][k]);
            //处理最后一列
            for (int j = i+1; j < n-i; j ++) res.add(matrix[j][m-i-1]);
            //处理最后一行
            for (int k = m-i-2; (k>=i)&&(n-i-1!=i); k --) res.add(matrix[n-i-1][k]);
            //处理第一列
            for (int j = n-i-2;(j>i)&&(m-i-1!=i); j --) res.add(matrix[j][i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(matrix.length);//行row
        System.out.println(matrix[0].length);//列
    }
}
