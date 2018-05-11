package LeetCode.niuke.dongtaiguihua;

import java.util.*;

public class wordBreakTestII {
    public static List<String> wordBreak(String s, Set<String> dict) {
        Map<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
        ArrayList<String> defaultList = new ArrayList<String>();
        defaultList.add("");
        map.put(-1, defaultList);
        return getAllPossibleSentences(s, dict, s.length() - 1, map);
    }

    private static ArrayList<String> getAllPossibleSentences(String s, Set<String> dict, int pos,
                                                 Map<Integer, ArrayList<String>> map) {
        if (map.containsKey(pos))
            return map.get(pos);

        String sub = s.substring(0, pos + 1);
        ArrayList<String> list = new ArrayList<String>();
        for (String word : dict) {
            if (sub.endsWith(word)) {
                int firstSegEnd = pos - word.length();
                if (firstSegEnd < -1) // no solution found
                    continue;

                ArrayList<String> subList = getAllPossibleSentences(s, dict, firstSegEnd, map);
                for (String str : subList) {
                    if ("".equals(str))
                        list.add(word);
                    else
                        list.add(str + " " + word);
                }
            } // if
        }// for
        map.put(pos, list);
        return list;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("cat");
        set.add("cats");
        set.add("and");
        set.add("sand");
        set.add("dog");
        System.out.println(wordBreak("catsanddog",set));

    }
}
