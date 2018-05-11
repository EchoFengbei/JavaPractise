package niuke.sort;

import java.util.Arrays;

public class FindMin {
    public int minNumberInRotateArray(int [] array) {
//        if(array == null || array.length == 0) return 0;
//        Arrays.sort(array);
//        return array[0];

        //采用二分法查找
        int low = 0;
        int high = array.length-1;
        int mid = (low + high)/2;
        while (low < high){
            if (array[mid] > array[high]){
                low = mid + 1;
            }else if (array[mid] < array[high]){
                high = mid;
            }else {
                high = high - 1;
            }
        }
        return  array[mid];
    }
}
