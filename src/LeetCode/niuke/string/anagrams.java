package LeetCode.niuke.string;

import java.util.*;

public class anagrams {
    public static ArrayList<String> anagrams(String[] strs) {
        ArrayList<String> res = new ArrayList<>();
        if(strs==null||strs.length==0){
            return res;
        }
        //string内部排序，然后找相同的加到list中
        Map<String , ArrayList<String>> map = new HashMap<>();
       for (String s : strs){
           String key = sortString(s);
           if (map.containsKey(key)){
               map.get(key).add(s);
           }else {
               map.put(key,new ArrayList<>());
               map.get(key).add(s);
           }
       }
       for (String ss : map.keySet()){
           ArrayList<String> list = new ArrayList<>();
           list = map.get(ss);
           if (list.size() > 1)
               res.addAll(list);
       }
      return res;
    }
    public static String sortString(String str){
        if (str == null || str.length() == 0) return null;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String[] strings = {"tea","and","ate","eat","den"};
        System.out.println(anagrams(strings));
    }
}
