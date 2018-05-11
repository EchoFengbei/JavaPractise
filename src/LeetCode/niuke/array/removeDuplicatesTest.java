package LeetCode.niuke.array;

public class removeDuplicatesTest {
    public static int removeDuplicates(int[] A) {
        int len = A.length;
        int index = 1;
        for (int i = 1; i < A.length-1; i ++){
            if (A[i] != A[i-1]){
                A[index] = A[i];
                index++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] num = {1,1,2};
        System.out.println(removeDuplicates(num));
    }
}
