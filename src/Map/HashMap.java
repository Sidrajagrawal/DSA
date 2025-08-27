package Map;

import java.util.*;

public class HashMap<K, V> {
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
    }

    private int size = 0;
    private ArrayList<Node<K, V>> buckets;

    public HashMap() {
        this(4);
    }

    public HashMap(int n) {
        buckets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buckets.add(null);
        }
    }

    public void put(K key, V value) {
        int idx = Hashfun(key);
        Node<K, V> head = buckets.get(idx);
        Node<K, V> temp = head;

        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }

        Node<K, V> nn = new Node<>();
        nn.key = key;
        nn.value = value;
        nn.next = head;
        buckets.set(idx, nn);
        size++;

        double thf = 2.0;
        double lf = (1.0 * size) / buckets.size();
        if (lf > thf) {
            rehashing();
        }
    }

    private void rehashing() {
        ArrayList<Node<K, V>> new_buckets = new ArrayList<>();
        for (int i = 0; i < 2 * buckets.size(); i++) {
            new_buckets.add(null);
        }
        ArrayList<Node<K, V>> old = buckets;
        buckets = new_buckets;
        size = 0;
        for (Node<K, V> nn : old) {
            while (nn != null) {
                put(nn.key, nn.value);
                nn = nn.next;
            }
        }
    }

    public V get(K key) {
        int idx = Hashfun(key);
        Node<K, V> temp = buckets.get(idx);
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public V remove(K key) {
        int idx = Hashfun(key);
        Node<K, V> curr = buckets.get(idx);
        Node<K, V> prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) break;
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) return null;
        if (prev == null) {
            buckets.set(idx, curr.next);
        } else {
            prev.next = curr.next;
        }
        size--;
        return curr.value;
    }

    private int Hashfun(K key) {
        int idx = key.hashCode() % buckets.size();
        if (idx < 0) idx += buckets.size();
        return idx;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("{");
        for (Node<K, V> nn : buckets) {
            while (nn != null) {
                s.append(nn.key).append("=").append(nn.value).append(",");
                nn = nn.next;
            }
        }
        return s.append("}").toString();
    }

    public int size() {
        return size;
    }
}
