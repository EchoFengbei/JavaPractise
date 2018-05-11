package niuke.NetEase;

import java.util.Scanner;

public class StringChips {
    public static float getStringChips(String str){
        char[] chars = str.toCharArray();
        int count = 1;
        for (int i = 0; i< chars.length-1; i++){
            if (chars[i]!=chars[i+1]){
                count ++;
            }else continue;
        }
        return (float) str.length()/count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.printf( "%.2f" , getStringChips(string));
    }
}
