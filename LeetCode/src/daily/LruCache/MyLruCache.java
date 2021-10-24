import java.util.Iterator;
import java.util.LinkedHashMap;

public class MyLruCache <K,V>{

    int maxSize = 0;
    LinkedHashMap<K,V> hashMap;

    public MyLruCache(int maxSize){
        this.maxSize = maxSize;
        hashMap = new LinkedHashMap<>(0,0.75f,true);
    }

    public V get(K key){
        if(!hashMap.containsKey(key)){
            return null;
        }
        V value = hashMap.get(key);
        return value;
    }

    public void put(K key,V value){
        hashMap.put(key,value);
        trimToSize();
    }

    private void trimToSize() {

        while(true){
            if(hashMap.size() <= maxSize){
                break;
            }
            Iterator iterator = hashMap.keySet().iterator();
            hashMap.remove(iterator.next());
        }
    }

    public void print(){
        Iterator iterator = hashMap.values().iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
    }


}
