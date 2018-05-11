package niuke;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] A) {
        if(A == null) return 0;
        if(A.length <= 2) return A.length;

        int count = 2;
        for(int i = 2; i<A.length; i++){
            if(A[i]!= A[count-2]){
                A[count] = A[i];
                count++;
            }
        }
        return count;
    }
}
