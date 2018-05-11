package niuke.zongheAndhuisu;


public class movingCountTest {
    public static int movingCount(int threshold, int rows, int cols){
       boolean[][] isVisited = new boolean[rows][cols];

       return walk(threshold,rows,cols,0,0,isVisited);

    }

    public static int walk(int threshold, int rows, int cols, int r, int c, boolean[][] isVisited){
        if (r<0 || r>=rows || c<0 || c>=cols || isVisited[r][c] || (bitSum(r) + bitSum(c)) > threshold){
            return 0;
        }
        isVisited[r][c] = true;
        return walk(threshold,rows,cols,r-1,c,isVisited)
                + walk(threshold,rows,cols,r+1,c,isVisited)
                + walk(threshold,rows,cols,r,c-1,isVisited)
                + walk(threshold,rows,cols,r,c+1,isVisited)
                + 1;
    }
    public static int bitSum(int n){
        int sum = 0;
        while (n != 0){
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(5,10,10));
    }
}
