package myMap;
import java.util.*;

public class Practice_Map<K,V> {
	static class Node<K,V>{
		K key;
		V value;
		Node<K,V> next;
	}
	
	private ArrayList<Node<K,V>> bukt;
	private int size = 0;
	
	public Practice_Map() {
		this(4);
	}
	public Practice_Map(int n) {
		bukt = new ArrayList<>();
		for(int i=0;i<n;i++) {
			bukt.add(null);
		}
	}
	
    private int Hashfun(K key) {
        int n = key.hashCode() % bukt.size();
        if (n < 0) n += bukt.size();
        return n;
    }
	
	public void put(K key,V value) {
		int idx = Hashfun(key);
		Node temp = bukt.get(idx);
		while(temp != null) {
			if(temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		temp = bukt.get(idx);
		nn.next = temp;
		bukt.set(idx, nn);
		size++;
	}
}
