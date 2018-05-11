package ThinkingInJava;

public class ImplementMap<K,V> {
    private Object[][] pairs;
    private int index;
    public ImplementMap(int length){
        pairs = new Object[length][2];//声明一个n行2列的对象数组，用来存储数据
    }

    public void put(K key, V value){
        if (index >= pairs.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index ++] = new Object[]{key,value};
    }

    @SuppressWarnings("unchecked")
    public V get(K key){
        for (int i = 0; i < index; i ++){
            if (key == pairs[i][0])
                return (V) pairs[i][1];
        }
        return null;
    }






    public static void main(String[] args) {

    }
}
