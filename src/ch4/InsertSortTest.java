package ch4;

public class InsertSortTest {
    void insertSort(int[] arr){
        //前两个元素排好序，后面的元素依次插入进来
        //从数组的第二个元素开始
        for (int i=1; i< arr.length; i ++){
            int insertData = arr[i];//设置数组中的第2个元素为第一次循环要插入的数据
            int j = i-1;
            while (j>=0 && insertData<arr[j]){
                arr[j+1] = arr[j];// 如果要插入的元素小于第j个元素,就将第j个元素向后移动
                j--;
            }
            arr[j+1] = insertData;// 直到要插入的元素不小于第j个元素,将insertData插入到数组中
        }
    }
}
