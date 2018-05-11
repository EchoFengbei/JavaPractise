package niuke.digui;

import java.security.interfaces.RSAKey;

public class RectCoverTest {
    public static int RectCover(int target) {
        int res = 0;
        if (target <= 0){
            return target;
        }
        if (target == 1){
            res = 1;
            return res;
        }
        if (target == 2){
            res = 2;
            return res;
        }
        res = 2+RectCover(target-2);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(RectCover(5));
    }
}
