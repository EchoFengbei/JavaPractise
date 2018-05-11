package niuke.shijianxiaolv;



import java.util.LinkedHashMap;
import java.util.Map;

public class MoreThanHalfNum_SolutionTest {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 0;
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < array.length; i ++){
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else map.put(array[i],1);
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue() > array.length/2){
                count = entry.getKey();
            }
        }
        return count;
    }
}
