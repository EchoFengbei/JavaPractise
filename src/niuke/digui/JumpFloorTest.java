package niuke.digui;

import jdk.nashorn.internal.ir.IfNode;

public class JumpFloorTest {
    public static int JumpFloor(int target) {
        int res = 0;
        if (target <= 0){
            res = 0;
            return res;
        }
        if (target == 1) {
            res = 1;
            return res;
        }
        if (target == 2) {
            res = 2;
            return res;
        }
        res = JumpFloor(target-1) + JumpFloor(target-2);
        return  res;
    }
    //进阶版跳台阶，可以跳一阶，2阶。。。n阶
    public int JumpFloorII(int target) {
        int res1 = 0;
        if(target <= 0) {
            res1 = 0;
            return res1;
        }
        if (target == 1){
            res1 = 1;
            return res1;
        }
        res1 = 2*JumpFloor(target-1);
        return res1;

    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(4));
    }
}
