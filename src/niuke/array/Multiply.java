package niuke.array;

public class Multiply {
    public static int[] multiply(int[] A) {
        int multi = 1;
        int[] B = new int[A.length];

        int[] left = new int[A.length];
        left[0] = 1;
        for (int i = 1; i < A.length; i ++){
            left[i] = A[i-1]*left[i-1];
        }
        int[] right = new int[A.length];
        right[A.length-1] = 1;
        for (int i= A.length-2; i >=0; i--){
            right[i] = A[i+1]*right[i+1];
        }

        for (int i= 0; i < A.length; i++){
           B[i] = left[i]*right[i];
        }
        return B;

        //自己写的，判断零判断得头都大了
//        int multi = 1;
//        int[] B = new int[A.length];
//        for (int i = 0; i < A.length; i ++){
//            if(A[i] == 0){
//                multi = multi * A[i+1];
//            }else multi = multi * A[i];
//        }
//        for(int j = 0; j < A.length; j ++){
//            if(A[j] == 0){
//                B[j] = multi;
//            }else B[j] = multi/A[j];
//        }
//        return B;
    }

    public static void main(String[] args) {
        int[] A ={1,2,0,4,5};
        int[] B = multiply(A);
        for (int k =0;k <B.length; k ++ ){
            System.out.println(B[k]);
        }
    }
}
