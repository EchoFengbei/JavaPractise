package LeetCode.niuke.array;

public class rotateImage {
    static int[][] res ;
    public static void rotate(int[][] matrix) {
        int n=matrix.length-1;
        for (int i = 0; i <= n/2; ++i)
        {
            for (int j = i; j < n-i; ++j)
            {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-j][i];//上列变右列
                matrix[n-j][i] = matrix[n-i][n-j];//右列变下列
                matrix[n-i][n-j] = matrix[j][n-i];//下列变左列
                matrix[j][n-i] = tmp;//左列变上列
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int i = 0; i < res.length; i ++){
            for (int j = 0; j < res.length; j ++){
                System.out.println(res[i][j]);
            }
        }
    }
}
