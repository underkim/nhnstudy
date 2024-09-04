import java.util.Iterator;
import java.util.Arrays;

public class Hashtable<K, V> implements Iterable<Hashtable.Entry<K, V>> {
    private Entry<K, V>[] table;
    private int size;

    public static class Entry<K, V> {
        final K Key;
        V value;

        public Entry(K key, V value) {
            this.Key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public Hashtable() {
        this.table = new Entry[16];
    }

    public int hashFunction(K key) {

        return Math.abs(key.hashCode() % this.table.length);

    }

    public void put(K key, V value) {
        int index = hashFunction(key);
        if (this.table[index] == null) {
            this.table[index] = new Entry<K, V>(key, value);
        } else {
            this.table[index].value = value;
        }
        size++;
    }

    public V get(K key) {
        int index = this.hashFunction(key);
        return this.table[index].value;
    }

    public Iterator<Entry<K, V>> iterator() {
        return Arrays.stream(table).iterator();
    }
}
