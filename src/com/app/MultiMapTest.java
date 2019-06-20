package com.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MultiMapping<K, V> {
	private Map<K, Collection<V>> map = new HashMap<>();

	void put(K key, V value) {
		if (map.get(key) == null)
			map.put(key, new ArrayList<V>());
		map.get(key).add(value);
	}
	
	Object get(Object key) {
		return map.get(key);
	}
}

public class MultiMapTest {

	public static void main(String[] args) {
		MultiMapping<Integer,Integer> m1 = new MultiMapping();
		m1.put(1,10);
		m1.put(1,20);
		m1.put(1,30);
		
		System.out.println(m1);
		System.out.println(m1.get(1));
	}

}
