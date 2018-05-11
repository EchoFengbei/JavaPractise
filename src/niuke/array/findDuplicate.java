package niuke.array;

import java.awt.geom.FlatteningPathIterator;
import java.util.Scanner;

public class findDuplicate {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        //题意没理解对
//        boolean flag = false;
//        for (int i = 0; i < duplication.length; i++){
//            for (int j = 0; j < numbers.length; j ++){
//                if (duplication[i] == numbers[j]){
//                    flag = true;
//                    break;
//                }
//            }
//        }
//        return flag;
//        重新写
        boolean flag = false;
        int k = 0;
        for (int i = 0; i < numbers.length; i ++){
            for (int j = i+1; j < numbers.length; j ++){
                if (numbers[i] == numbers[j] && numbers[i]>=0 && numbers[i]<= length-1){
                    duplication[k] = numbers[i];//
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,1,4};
        int[] duplication = {1};
        System.out.println(duplicate(numbers,numbers.length,duplication));
    }
}
