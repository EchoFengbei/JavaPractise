package niuke.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class NotRepeatChar2 {
    private Map<Character,Integer> map = new LinkedHashMap<>();
    public void Insert(char ch)
    {
        if (map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else map.put(ch,0);
    }
    public char FirstAppearingOnce()
    {
        for (Map.Entry<Character, Integer> set : map.entrySet()){
            if (set.getValue() == 0){
                return set.getKey();
            }
        }
        return '#';
    }
}
