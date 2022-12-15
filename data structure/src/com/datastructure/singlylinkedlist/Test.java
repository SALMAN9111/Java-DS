package com.datastructure.singlylinkedlist;

class Test {
//instance variables
	int a = 10;
	int b;
//static variables
	static int i = 100;
	static int j;

//instance methods
	void m1() {
		System.out.println("m1-instance method");
	}

	void m2(int i, char ch, String str) {
		System.out.println(i);
		System.out.println(ch);
		System.out.println(str);
	}

	static void m3(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}

	static void m4(String str, char ch) {
		System.out.println(str);
		System.out.println(ch);
	}

//constructors
	Test() {
		System.out.println("0 arg constructor");
	}

	Test(int i, int j) {
		System.out.println("2 arg constructor");
	}

//instance blocks
	{
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block-2");
	}
//static block
	static {
		System.out.println("durga");
		System.out.println("durga");
		System.out.println("durga");
	}
	static {
		System.out.println("software");
		System.out.println("software");
		System.out.println("software");
	}

	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test(10, 20);
		t.m1();
		t.m2(10, 'r', "ratna");
		m3(100, 200);
		m4("rattaiah", 'd');
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(i);
		System.out.println(j);
	}
}