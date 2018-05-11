package niuke;

public class SortColors {
    public static void sortColors(int[] A) {
        for (int i=0; i<A.length; i++){
            for (int j=i+1; j<A.length; j++){
                if (A[j]<=A[i]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {0,2,1,0,2,1,0,0,1};
        sortColors(A);
        for (int k=0; k<A.length; k++){
            System.out.print(A[k] + "\t");
        }
    }
}
