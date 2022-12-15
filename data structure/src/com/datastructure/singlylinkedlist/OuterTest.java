package com.datastructure.singlylinkedlist;

public class OuterTest {
	public static void main(String[] args) {
		OuterAndInnerClass o = new OuterAndInnerClass();
		OuterAndInnerClass.Inner i = o.new Inner();
		i.m1(300);
	}
}

//abstract class Test {
//	abstract void m1();
//};
//
//class OuterClass {
//	void m2() {
//		System.out.println("m2 method");
//	}
//
//	Test t = new Test() {
//		void m1() {
//			System.out.println("annonymus inner class");
//		}
//	};
//};
//
//class Demo {
//	public static void main(String[] args) {
//		OuterClass o = new OuterClass();
//		o.m2();
//		o.t.m1();
//	}
//};