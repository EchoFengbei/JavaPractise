package ch4;

public class ShellSortTest {
    void shellSort(int[] arr){
        for (int r=arr.length/2; r>=1; r=r/2){
            for (int i=r; i<arr.length; i++){
                int temp = arr[i];
                int j = i-r;
                while (j>=0 && temp<arr[j]){
                    arr[j+1] = arr[j];
                    j = j -r;
                }
                arr[j+r] = temp;
            }
        }
    }
}
