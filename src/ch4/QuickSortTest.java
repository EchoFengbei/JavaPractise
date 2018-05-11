package ch4;

import javax.swing.text.html.HTMLDocument;

public class QuickSortTest {
    void quickSort(int[] arr,int low,int high){
        int i = low;
        int j = high;
        if (low> high){return;}
        int temp = arr[low];//作为分界值


        while (i<j){
            while (arr[j]>temp){
                j --;
            }
            while (arr[i]<temp){
                i ++;
            }
            //如果满足交换条件，则交换
            if (i<=j){
                int t = arr[high];
                arr[high] = arr[low];
                arr[low] = t;
            }
        }
        //基准位与i，j相等的点交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用，在左半边实现快排
        quickSort(arr,low,j-1);
        //右半边数组
        quickSort(arr,j+1,high);
    }

    public static void main(String[] args) {

    }
}
