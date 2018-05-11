package LeetCode.niuke.huisu;

import java.util.ArrayList;
import java.util.Collections;

public class getPermutationTest {
    public static String getPermutation(int n, int k) {
        ArrayList<String> list = new ArrayList<>();
        char[] chars = new char[n];
        for (int i = 0; i < n; i++)
            chars[i] = (char) ('1' + i);
       //输入获得的结果，对str进行全排列
        myPermutation(chars,0,list);
        Collections.sort(list);
        return  list.get(k-1);
    }
    public static void myPermutation(char[] chars,int start,ArrayList<String> list){
        if (start == chars.length-1){
            list.add(String.valueOf(chars));
        }else{
            for (int i = start; i < chars.length; i ++){
                swap(chars,i,start);//start位置的元素分别和后面的元素进行交换
                myPermutation(chars,start+1,list);
                swap(chars,start,i);//复位
            }
        }
    }
    public static void swap(char[] chars,int i, int j){
        //交换元素，形成新的数组
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(3,4));
    }
}
