package niuke.NetEase;

import java.util.Scanner;

public class MagicBills {
     private static StringBuffer sb = new StringBuffer();
     public static String getMagicBills(int n){
         if (n == 0){
             sb.append("");
             return "";
         }
         if (n % 2 != 0 ){
             sb.append("1");
             getMagicBills((n-1)/2);
         }else {
             sb.append("2");
             getMagicBills((n-2)/2);
         }
         return sb.toString();
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println( new StringBuilder(getMagicBills(n)).reverse().toString());
    }

}
