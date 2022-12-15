package com.datastructure.singlylinkedlist;

public class OuterAndInnerClass {
	int a = 100;

	class Inner {
		int a = 200;

		void m1(int a) {
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(OuterAndInnerClass.this.a);
		}
	}
}

