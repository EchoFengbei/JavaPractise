package ch4;

public class SelectSortTest {
    void selectSort(int[] arr){
        //每次找出最小的数放到当前乱序数组的第一个
        for (int i=0; i<arr.length-1;i++){
            int index = i;
            //找到比index更小的数
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[index]){
                    index = j;
                }
            }
            if (index != i){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
