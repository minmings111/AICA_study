package javalab.ch12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Map Interface
// paired with Key and value
// Key is not allow duplication. value allow duplication.
// ignored the entered sequence.

public class MapEx {

	public static void main(String[] args) {
		System.out.println("====HashMap=====");
		Map<String, String> hashMap = new HashMap<>();
		
		// If a key is duplicated, 
		// the value of that key is overwritten.
		hashMap.put("A", "apple");
		hashMap.put("C", "banana");
		hashMap.put("B", "watermelon");
		hashMap.put("F", "pear");
		hashMap.put("B", "citrus");
		
		for(String key: hashMap.keySet()) {
			String value = hashMap.get(key);
			System.out.println(value);
		}
		
		
		
		// under is trends. use it.		
		hashMap.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println(hashMap.size());
		System.out.println(hashMap.get("A"));
		// we don't have G key. so return "null"
		System.out.println(hashMap.get("G"));
		
		// compiler check the key or value
		System.out.println(hashMap.containsKey("G"));
		System.out.println(hashMap.containsValue("citrus"));
		
		hashMap.remove("B"); //remove only one in hashMap
		hashMap.clear(); //remove all in hashMap
		
		
		
		
		
		
		// LinkedHashMap

		
		System.out.println("====LInkedHashMap=====");
		Map<String, String> LindedhMap = new LinkedHashMap<>();
		
		// If a key is duplicated, 
		// the value of that key is overwritten.
		LindedhMap.put("A", "apple");
		LindedhMap.put("C", "banana");
		LindedhMap.put("B", "watermelon");
		LindedhMap.put("F", "pear");
		LindedhMap.put("B", "citrus");
		
		LindedhMap.forEach((k, v) -> System.out.println(k + ":" + v));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
