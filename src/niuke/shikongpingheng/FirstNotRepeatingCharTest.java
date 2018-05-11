package niuke.shikongpingheng;


import java.util.*;

public class FirstNotRepeatingCharTest {
    public int FirstNotRepeatingChar(String str) {
//        return 0;
        int position = -1;
        if (str.length() <= 0) {
            position = -1;
            return position;
        }
        if (str.length() == 1){
            position = 0;
            return position;
        }

        char key = '0';//char初始化不能为空
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else map.put(str.charAt(i),0);
        }

//        for (Map.Entry<Character,Integer> set:map.entrySet()){
//            if (set.getValue() == 0){
//                key = set.getKey();
//                break;
//            }
//        }
        for (int i = 0; i < str.length(); i ++){
           if (map.get(str.charAt(i))== 0){
               position = i;
               break;
           }
        }
        return position;
    }
}
