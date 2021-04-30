package com.epam.java8;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> treemap = new TreeMap<String, String>(Collections.reverseOrder());

		// Put elements to the map
		treemap.put("1", "Welcome");
		treemap.put("2", "to");
		treemap.put("3", "the");
		treemap.put("4", "Geeks");
		treemap.put("5", "Community");

		for (Entry<String, String> map : treemap.entrySet()) {
			System.out.println("Key:::" + map.getKey() + ",Value:::" + map.getValue());
		}

	}

}
