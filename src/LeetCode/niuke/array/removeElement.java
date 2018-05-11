package LeetCode.niuke.array;

import java.util.ArrayList;

public class removeElement {
    public static int removeElement(int[] A, int elem){
       int i = 0;
       int j = 0;
       for (; i < A.length; i ++){
           if (A[i] == elem) continue;
           A[j] = A[i];
           j ++;
       }
       return j;
    }

    public static void main(String[] args) {
        int[] A = {4,5};
        System.out.println(removeElement(A,4));
    }
}
