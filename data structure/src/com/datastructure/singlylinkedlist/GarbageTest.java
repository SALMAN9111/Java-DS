package com.datastructure.singlylinkedlist;

import java.util.Vector;

//

import java.util.ArrayList;
import java.util.ListIterator;

//
public class GarbageTest {
	public void finalize() {
		System.out.println("ratan sir destroyed");
//
		int a = 10 / 0;
	}

//
	public static void main(String[] args) {
		GarbageTest t1 = new GarbageTest();
		GarbageTest t2 = new GarbageTest();
		t1 = t2;
		System.gc();
		System.out.println(t1 instanceof GarbageTest);// returns true if it belongs to same class else false
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(93846);
		arr.add(76);
		System.out.println(arr);
		for (Integer a : arr) {
			System.out.println(a);
		}
		Vector<Integer> v = new Vector();
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
//		v.addElement("rattaiah");
		System.out.println(v);
		v.removeElement(0);
		System.out.println(v);
		ListIterator	 i = v.listIterator();
		while(i.hasNext()) {
			Integer i1 = (Integer)i.next();
		
			if(i1==5) {
				i.remove();
			}
			
		}
		System.out.println("listIterator i :"+v);
		v.clear();
		System.out.println(v);
	}

}

//class GarbageTest {
//	public static void main(String[] args) {
//		
//	}
//}