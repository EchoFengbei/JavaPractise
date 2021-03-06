package niuke.zongheAndhuisu;

public class hasPathInMatrixII {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] isVisited = new boolean[matrix.length];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j ++){
                if (searchFromHere(matrix,rows,cols,i,j,0,str,isVisited))
                    return true;
            }
        }
        return false;
    }
    public boolean searchFromHere(char[] matrix, int rows, int cols, int r, int c,
                                  int index, char[] str, boolean[] isVisited ){
        if (r<0 || r>=rows || c<0 || c>=cols || matrix[r*cols+c] != str[index] || isVisited[r*cols+c]) return false;
        if (index == str.length-1) return true;
        isVisited[r*cols+c] = true;
        if (searchFromHere(matrix,rows,cols,r-1,c,index+1,str,isVisited)
                || searchFromHere(matrix,rows,cols,r+1,c,index+1,str,isVisited)
                || searchFromHere(matrix, rows, cols, r, c-1, index+1, str, isVisited)
                || searchFromHere(matrix,rows,cols,r,c+1,index+1,str,isVisited)) return true;
        isVisited[r*cols+c] = false;
        return false;
    }
}
