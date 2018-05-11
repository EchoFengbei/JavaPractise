package LeetCode.niuke.string;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class countAndSayTest {
    public static String countAndSay(int n) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("11");
        int count = 2;
        while (count < n){
            String str1 = list.get(list.size()-1);
            Map<Character,Integer> map = new LinkedHashMap<>();
            StringBuffer sb = new StringBuffer();
            int len = str1.length();
            for (int i = 0; i < len; i ++){
                map.put(str1.charAt(i),1);
            }
            for (int i = 1; i < len; i ++){
                char temp = str1.charAt(i);
                if (temp == str1.charAt(i-1)){
                    map.put(temp,map.get(str1.charAt(i-1)) + 1);
                    map.remove(map.size()-1);
                }
            }
            for (Map.Entry<Character, Integer> set : map.entrySet()){
                sb.append(set.getValue());
                sb.append(set.getKey());
            }
            list.add(sb.toString());
            count ++;
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
