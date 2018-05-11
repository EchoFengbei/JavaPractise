package ch3;

public class MonteCarlo {
    double countPi(int n){
        double x;
        double y;
        int m =0;//落在阴影部分的数量
        double pi = 0;
        for (int i=0; i<n; i ++){
            x = Math.random();
            y = Math.random();
            if ((x*x + y*y) <= 1){
                m ++;
            }
        }
        pi = 4*m/n;
        return pi;
    }
}
