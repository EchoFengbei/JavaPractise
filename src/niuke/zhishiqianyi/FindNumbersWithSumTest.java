package niuke.zhishiqianyi;

import java.util.ArrayList;

public class FindNumbersWithSumTest {
    static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

//        for (int i = 0; i < array.length; i ++){
//            if (BinaryFind(array,sum-array[i])){
//                if (array[i] <= (sum-array[i])){
//                    list.add(array[i]);
//                    list.add(sum-array[i]);
//                }else {
//                    list.add(sum-array[i]);
//                    list.add(array[i]);
//                }
//                break;
//            }
//        }
//        return list;

        //首尾各使用一个指针
        int i = 0;
        int j = array.length-1;

        while (i < j){
            if (array[i] + array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
            }else if (array[i] + array[j] < sum){
                i ++;
            }else j ++;
        }
        return list;
    }
//    public static boolean BinaryFind(int[] array, int num){
//        int low = 0;
//        int high = array.length-1;
//        int mid = (low + high)/2;
//
//        while (low < high){
//            if (array[mid] > num){
//                high = mid -1;
//            }else if (array[mid] < num){
//                low = mid +1;
//            }else return true;
//            mid = (low + high)/2;
//        }
//        return false;
//    }

    public static void main(String[] args) {
        int[] array = {1,2,4,7,11,16};
        System.out.println(FindNumbersWithSum(array,17));
    }
}
