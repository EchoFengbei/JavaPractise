package niuke.daimawanzheng;

import com.sun.deploy.panel.ITreeNode;

public class PowerTest {
    public static double Power(double base, int exponent) {
        double temp = 1;
        if (exponent == 0) return temp;
        else if (exponent > 0){
            for (int i = 1; i <= exponent; i ++){
                temp = temp * base;
            }
            return temp;
        }else {
            for (int j = 1; j <= Math.abs(exponent); j ++){
                temp = temp / base;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Power(2,3));
    }
}
