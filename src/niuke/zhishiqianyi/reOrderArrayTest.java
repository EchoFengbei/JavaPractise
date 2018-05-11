package niuke.zhishiqianyi;

import java.util.ArrayList;

public class reOrderArrayTest {

    public static void reOrderArray(int [] array) {
//        ArrayList<Integer> odd = new ArrayList<>();
//        ArrayList<Integer> even = new ArrayList<>();
//        for (int i = 0; i < array.length; i ++){
//            if (array[i] % 2 != 0){
//                odd.add(array[i]);
//            }else even.add(array[i]);
//        }
//        odd.addAll(even);
//        for(int i = 0;i < odd.size(); i ++){
//            array[i] = odd.get(i);
//        }
        //类似快排，要是稳定排序
        if (array == null){
            return;
        }
        int i = 0;
        int j = array.length-1;
        while (i < j){
            while (i < j && array[i]%2==1){
                i++;
            }
            while (i < j && array[j]%2==0){
                j--;
            }
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }


    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
        for (int i =0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }
}
