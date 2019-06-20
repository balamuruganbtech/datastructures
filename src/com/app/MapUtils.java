package com.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MultiMap<K, V> {

	private Map<K, Collection<V>> map = new HashMap<>();

	// put
	public void put(K key, V value) {
		if (map.get(key) == null)
			map.put(key, new ArrayList<V>());

		map.get(key).add(value);
	}
	
	// get
	public Collection<V> get(Object key){
		return map.get(key);
	}
	
	// values
	public Collection<Collection<V>> values(){
		return map.values();
	}
	
	// keyset
	public Set<K> keySet(){
		return map.keySet();
	}
}

public class MapUtils {

	public static void main(String[] args) {
		MultiMap<String, String> mm = new MultiMap();
		mm.put("a", "bala");
		mm.put("a", "murugan");
		mm.put("b", "suresh");
		mm.put("c", "babu");

		System.out.println("Values ===>"+mm.values());
		System.out.println("keySet ====>"+mm.keySet());
		System.out.println("mm.get(c) ====>"+mm.get("c"));
		
		MultiMap<Integer, String> mm1 = new MultiMap();
		mm1.put(1, "test");
		mm1.put(1, "murugan");
		
		System.out.println(mm1.values());
	}

}
