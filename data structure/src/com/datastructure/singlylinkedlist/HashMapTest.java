package com.datastructure.singlylinkedlist;

import java.util.*;


public class HashMapTest {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("sambha", 100);
		h.put("veeru", 100);
		h.put("durga", 100);
		System.out.println("Line 12" + h);
		Set s = h.keySet();
		System.out.println("\nonly keys values" + s);
		Collection c = h.values();
		System.out.println("\nonly values" + c);
		Set s1 = h.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "------" + m1.getValue());
			if (m1.getKey().equals("sambha")) {
				m1.setValue("gayan TeamLead");
			}
		}
		System.out.println(s1);

		System.out.println("\n\n HASHTABLE");

		Hashtable h1 = new Hashtable();
		h1.put("hyd", 100);
		h1.put("bang", 200);
		h1.put("pune", 300);
		System.out.println(h1);
		System.out.println(h1.contains(300));// true
		System.out.println(h1.containsValue(500));// false
		Collection c1 = h1.values();
		System.out.println(c1);
		Set c2 = h1.keySet();
		System.out.println(c2);
	}

}
