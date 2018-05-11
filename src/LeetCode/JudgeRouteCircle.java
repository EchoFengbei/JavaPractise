package LeetCode;

public class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i ++){
            switch (moves.substring(i,i+1)){
                case "U":
                    y ++;
                    break;
                case  "D":
                    y --;
                    break;
                case  "L":
                    x --;
                    break;
                case "R":
                    x ++;
                    break;
            }
        }
        if ( x==0 && y==0){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        judgeCircle("UD");
    }
}
