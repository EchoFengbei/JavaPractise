package niuke.zhishiqianyi;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetNumberAppearTimes {

    public int GetNumberOfK(int [] array , int k) {
//        int count = 0;
//        Map<Integer,Integer> map = new LinkedHashMap<>();
//
//        for (int i = 0; i < array.length; i ++){
//            if (map.containsKey(array[i])){
//                map.put(array[i],map.get(array[i])+1);
//            }else map.put(array[i],1);
//        }
//        for ( Map.Entry<Integer, Integer> entry : map.entrySet()){
//            if (entry.getKey() == k){
//                count = entry.getValue();
//            }
//        }
//        return count;


        //数组有序，想到二分查找,思路，找到第一个K和最后一个K的位置，求差值就是总共的个数
        int start = getFirstK(array,k,0,array.length-1);
        int end = getLastK(array,k,0,array.length);
        if (start != -1 && end != -1){
            return end - start +1;
        }
        return 0;
    }
    //循环找到第一个k
    private int getFirstK(int[] array, int k, int start, int end){
        int mid = (start + end)/2;
        while (start <= end){
            if (array[mid] < k){
                start = mid +1;
            }else if (array[mid] > k){
                end = mid -1;
            }else if (mid-1 >=0 && array[mid-1] == k){
                end = mid -1;//保证向左遍历，找到第一个k
            }else return mid;
        }
        return mid;
    }
    //递归找到最后一个k
    private int getLastK(int[] array, int k, int start, int end){
        int mid = (start +end)/2;
        if (start > end){
            return -1;
        }
        if (array[mid] < k){
            return getLastK(array,k,mid+1,end);
        }else if (array[mid] > k){
            return getLastK(array,k,start,mid-1);
        }else if (mid+1 < array.length && array[mid +1] == k){
            return getLastK(array,k,mid+1,end);
        }else return mid;
    }
    public static void main(String[] args) {

    }
}
