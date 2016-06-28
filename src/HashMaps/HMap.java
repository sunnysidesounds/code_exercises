package HashMaps;

public class HMap<K, V> {
    HashNode<K, V> mapList[] = new HashNode[100];

    public V get(K key){
        int index = getHash(key);
        HashNode<K, V> list = mapList[index];
        return getHashNode(list, key);
    }

    public void put(K key, V value){
        int index = getHash(key);
        setHashNode(index, key, value);
    }

    public void remove(K key){
        int index = getHash(key);
        removeHashNode(index, key);
    }

    private void removeHashNode(int index, K key){
        HashNode<K,V> list = mapList[index];
        if(list == null){
            return;
        }

        if(list.getKey().equals(key)){
            if(list.next == null){
                mapList[index] = null;
                return;
            }
        }
        HashNode<K, V> previous = null;
        do{
            if(list.key.equals(key)){
                if(previous == null){
                    list = list.getNext();
                } else {
                    previous.next = list.getNext();
                }
                break;
            }
            list = list.next;
        } while(list != null);
        mapList[index] = list;

    }

    private void setHashNode(int index, K key, V value){
        HashNode<K, V> list = mapList[index];
        if(list == null){
            mapList[index] = new HashNode<K, V>(key, value);
        } else {
            boolean finished = false;
            while(list.next != null){
                if(list.getKey().equals(key)){
                    list.setValue(value);
                    finished = true;
                    break;
                }
                list = list.next;
            }
            if(!finished){
                list.next = new HashNode<K, V>(key, value);
            }
        }
    }


    private V  getHashNode(HashNode<K, V> list, K key){
        while(list != null){
            if(list.getKey().equals(key)){
                return list.getValue();
            }
            list = list.next;
        }
        return null;
    }

    private int getHash(K key){
        int hash = key.hashCode();
        return (hash % 100);
    }

}






class HashNode<K, V>{
    K key;
    V value;
    HashNode<K, V> next = null;

    public HashNode(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void setNext(HashNode<K, V> next){
        this.next = next;
    }

    public HashNode<K, V> getNext(){
        return this.next;
    }

    public void setKey(K key){
        this.key = key;
    }

    public K getKey(){
        return this.key;
    }

    public void setValue(V value){
        this.value = value;
    }

    public V getValue(){
        return this.value;
    }
}


