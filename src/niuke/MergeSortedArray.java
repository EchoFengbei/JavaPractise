package niuke;

import java.util.Arrays;

public class MergeSortedArray {
    //升序
    public static void merge(int A[], int m, int B[], int n) {
        int i = m-1;
        int j = n-1;
        int index = m+n-1;
        if(m==0){
            for(int k=0;k<B.length;k++)
                A[k]=B[k];
        }
        while (i>=0 && j>=0){
            if (A[i]>=B[j]){
                A[index] = A[i];
                i--;
                index--;
            }else {
                A[index] = B[j];
                j--;
                index--;
            }
            if (i==-1){
                while (j>=0){
                    A[index] = B[j];
                    j--;
                    index--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] A = {1,3,5,7,9};
        int[] B ={2,4,6,8};
        merge(A,5, B, 4);
        for (int k=0; k<A.length; k++){
            System.out.println(A[k]);
        }
    }
}
