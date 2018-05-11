package ch5;

import java.util.Locale;

public class SequentialSearchTest {
    int sequenceSearch(int[] arr, int key){
        int location = -1;
        //key与arr数组中所有的元素做对比
        for (int i=0; i<arr.length; i ++){
            if (arr[i]==key){
                location = i;
                break;
            }
        }
        return location;
    }
}
