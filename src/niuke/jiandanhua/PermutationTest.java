package niuke.jiandanhua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class PermutationTest {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() == 0) return list;
        allPermutation(str.toCharArray(),list,0);
        Collections.sort(list);
        return list;
    }
    public void allPermutation(char[] chars,ArrayList<String> list,int start){
        /*全排列，没有去重
        * */
        //长度为一
        if (start == chars.length-1){
            list.add(String.valueOf(chars));
        }else{
            for (int i = start; i < chars.length; i ++){
                swap(chars,i,start);//start位置的元素分别和后面的元素进行交换
                allPermutation(chars,list,start+1);
                swap(chars,start,i);//复位
            }
        }
    }
    /*去重的全排列，当前字符跟他后面的所有不重复的字符交换
    即在以上的基础上增加一个判断
    * */
    public void allPermutationII(char[] chars,ArrayList<String> list,int start){
        /*全排列，没有去重
        * */
        //长度为一
        if (start == chars.length-1){
            list.add(String.valueOf(chars));
        }else{
            for (int i = start; i < chars.length; i ++){
                //判断，当start和后面的元素不重合时，交换
                if (!isRepeat(chars,start,i)){
                    swap(chars,i,start);//start位置的元素分别和后面的元素进行交换
                    allPermutation(chars,list,start+1);
                    swap(chars,start,i);//复位
                }
            }
        }
    }
    /*对全排列去重的另一种方式，将所有的字符放进set里面
    */
    public void allPermutationIII(char[] chars,ArrayList<String> list,int start){
        /*全排列，没有去重
        * */
        //长度为一
        Set<Character> set = new HashSet<>();
        for (int i =0; i < chars.length; i ++){
            set.add(chars[i]);
        }
        if (start == chars.length-1){
            list.add(String.valueOf(chars));
        }else{
            for (int j = start+1; j < set.size(); j ++){
                swap(chars,j,start);
                allPermutationIII(chars,list,start+1);
                swap(chars,start,j);
            }
        }
    }

    public void swap(char[] chars,int i,int j){
        char ch = chars[i];
        chars[i] = chars[j];
        chars[j] = ch;
    }
    public boolean isRepeat(char[] chars,int start,int end){
        for (int i = start; i < end; i ++){
            if (chars[i] == chars[end]){
                return true;
            }
        }
        return  false;
    }
}
