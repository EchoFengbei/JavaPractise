package niuke;

import java.util.ArrayList;


public class RemoveElement {
    public static int removeElement(int[] A, int elem) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<A.length; i ++){
            if (elem==A[i]){
            }else {
                list.add(A[i]);
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
        int[] A = {4,5};
        System.out.println(removeElement(A,4));
    }
}
