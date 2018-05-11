package LeetCode.array;

public class search2dMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        //从左下角开始遍历，比当前元素小，则在上面，比当前元素大则在右边
        int i = matrix.length-1; //行
        int j = 0;//列
       while (i >= 0 && j < matrix[0].length){
           if (target > matrix[i][j]){
               j ++;
           }else if (target < matrix[i][j]){
               i --;
           }else return true;
       }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}};
        System.out.println(searchMatrix(matrix,3));
    }
}
