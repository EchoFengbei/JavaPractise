package ThinkingInJava;


import java.util.*;
class MapEntry<K,V> implements Map.Entry<K,V>{

    @Override
    public K getKey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }

    @Override
    public V setValue(V value) {
        return null;
    }
}

public class SampleHashMap<K,V> extends AbstractMap<K,V>{
    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
            //buckets是装送来保存
    LinkedList <MapEntry<K,V>> [] buckets = new LinkedList[SIZE];

    public V put(K key, V value){
        V oldValue = null;
        int index = Math.abs(key.hashCode())%SIZE;//对键进行哈希编码，为了使每个产生的数字适应buckets的大小，按
        // 照数组大小取模
        if (buckets[index] == null){
            //当前位置没有元素，new一个LinkedList,查看当前元素是否含有相同元素，如果有，将旧的值赋给oldValue
            //用新的值取代旧的值，found来标记是否找到相同的旧的键值对，如果没有，插到LinkedList的末尾
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        MapEntry<K,V> pair = new MapEntry<K, V>();
        boolean found = false;
        ListIterator<MapEntry<K,V>> it = bucket.listIterator();
        while (it.hasNext()){
            MapEntry<K,V> ipair = it.next();
            if (ipair.getKey().equals(key)){
                oldValue = ipair.getValue();
                it.set(ipair);
                found = true;
                break;
            }
        }
        if (!found){
            buckets[index].add(pair);
        }
        return oldValue;
    }
    public V get(Object key){
        int index = Math.abs(key.hashCode())%SIZE;
        if (buckets[index] == null) return null;
        for (MapEntry<K,V> ipair: buckets[index]){
            return ipair.getValue();
        }
        return  null;
    }
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }


}
