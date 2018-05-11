package LeetCode.niuke.array;

import java.util.ArrayList;

public class spiralMatrix {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return null;
        //先分层，然后按照每一层每一层处理
        int m = matrix.length;//行
        int n = matrix[0].length;//列
        int layerNum = Math.min(m,n)/2;
        for (int layer = 0; layer < layerNum; layer ++){
            //上列
            for (int j = layer; j < n-layer-1; j ++){
               res.add(matrix[layer][j]);
            }
            //右列
            for (int j = layer; j < m-layer-1; j ++){
                res.add(matrix[j][n-1-layer]);
            }
            //下列
            for (int j = n-1-layer; j >layer; j--){
                res.add(matrix[m-1-layer][j]);
            }
            //左列
            for (int j = m-1-layer; j > layer; j--){
                res.add(matrix[j][layer]);
            }
        }
        if (Math.min(matrix.length,matrix[0].length)%2 == 1){
            if (m < n){
                for (int j = layerNum;j < n-layerNum; j ++){
                    res.add(matrix[layerNum][j]);
                }
            }else {
                for (int j = layerNum; j < m-layerNum; j ++){
                    res.add(matrix[j][layerNum]);
                }
            }
        }
        return res;
    }
}
