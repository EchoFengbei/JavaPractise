package ch4;

public class BubbleSortTest {
    void bubbleSort(int[] arr){
        //第一个数据和之后的所有数据比较，然后交换，以此类推
        int temp;
        for (int i=0; i<arr.length; i ++){
            for (int j=1; j < arr.length-i; j ++){
                if (arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
