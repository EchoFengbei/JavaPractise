package niuke.jiandanhua;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class CombinedTest {
    static ArrayList<Character> list = new ArrayList<>();
    public static void combine(int index,char[] chars, int k){
        //参数index是指开始的位置，k是从数组中选取k个值
        if (k == 1){
            for (int i = index; i < chars.length; i ++){
                list.add(chars[i]);
                System.out.println(list);
                list.remove((Object)chars[i]);//tmpArr因为是临时存储的，上一个组合找出后就该释放空间，存储下一个元素继续拼接组合了
            }
        }else if (k > 1){
            for (int i = index; i <= chars.length - k; i ++){
                list.add(chars[i]);
                combine(i+1,chars,k-1);
                list.remove((Object)chars[i]);
            }
        }else return;
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','c','d'};
        combine(0,chars,3);

    }
}
