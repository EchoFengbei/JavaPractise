package niuke.array;

public class SearchArray {
    public boolean Find(int target, int [][] array) {
//        for (int i = 0; i < array.length; i ++){
//            for (int j = i;j < array[i].length; j ++){
//                if (target == array[i][j]) return true;
//            }
//        }
//        return false;

        //从左下角开始遍历，如果target大于当前值，向右寻找，如果小于当前值，向右寻找
        int row = array.length-1;
        int col = 0;
        while ((row >= 0) && (col < array[0].length)){
            if (array[row][col] > target){
                row --;
            }else if (array[row][col] < target){
                col ++;
            }else return true;
        }
        return false;
    }
}
