package niuke.zhishiqianyi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class FindNumsAppearOnceTest {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < array.length; i ++){
          if (set.contains(array[i])){
              set.remove(array[i]);
          }else set.add(array[i]);
      }
      int[] temp = new int[2];
      int i = 0;
      Iterator<Integer> iterator = set.iterator();
      while(iterator.hasNext()){
           temp[i] = iterator.next();
           i ++;
      }
      num1[0] = temp[0];
      num2[0] = temp[1];
    }

    //一个叼思路，从头到尾异或所有的数据，如果最终异或的结果不为0.则为那个数据
    public void FindNumsAppearOnceI(int [] array,int num1[] , int num2[]){
        for (int i = 0; i < array.length; i ++){

        }
    }
}
