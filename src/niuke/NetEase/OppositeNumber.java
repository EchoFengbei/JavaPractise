package niuke.NetEase;

import java.util.Scanner;

public class OppositeNumber {
    public static int getOppositeNumber(int num){
        StringBuffer opp = new StringBuffer(String.valueOf(num)).reverse();
        int res = num + Integer.parseInt(opp.toString());
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getOppositeNumber(n));
    }
}
