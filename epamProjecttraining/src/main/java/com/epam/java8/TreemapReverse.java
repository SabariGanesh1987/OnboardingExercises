package com.epam.java8;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreemapReverse {

	public static void main(String[] args) {
		reverseEmp rev = () -> {
			TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
			tm.put(1, "Hello");
			tm.put(4, "Mr");
			tm.put(3, "Good");
			tm.put(2, "Morning");
			tm.put(5, "John");
			System.out.println("Intial TreeMap is: " + tm);
			TreeSet<String> tsv = new TreeSet<String>();
			TreeSet<Integer> tsk = new TreeSet<Integer>();
			for (Map.Entry<Integer,String> m : tm.entrySet()) {
				tsv.add((String) m.getValue());
			}
			for (Map.Entry<Integer,String> m : tm.entrySet()) {
				tsk.add((Integer) m.getKey());
			}
			System.out.println("Reversed TreeMap is: ");
			Iterator<String> itr = tsv.descendingSet().iterator();
			while (itr.hasNext()) {
				String i = itr.next();
				System.out.println(getKey(tm, i) + " = " + i);
			}
		};
		rev.reverseTreeMap();
	}

	public static Integer getKey(TreeMap<Integer, String> tm, String value) {
		Integer it = null;
		for (Map.Entry<Integer,String> entry : tm.entrySet()) {
			if (value.equalsIgnoreCase((String) entry.getValue())) {
				it = (Integer) entry.getKey();
			}
		}
		return it;
	}

	
	interface reverseEmp{
		public void reverseTreeMap();
	}

}
