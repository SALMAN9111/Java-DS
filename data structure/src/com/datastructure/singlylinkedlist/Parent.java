package com.datastructure.singlylinkedlist;

public class Parent {
	void property() {
		System.out.println("money+land+hhouse");
	}

	void marry() {
		System.out.println("black girl");
	}
}

class Child extends Parent {
	void marry() {
		System.out.println("white girl/red girl");
	}

	static Integer i = 10;// i is wrapper object
	static int j;// j is primitive variable

	public static void main(String[] args)

	{
		Child c = new Child();
		c.property();
		c.marry();
		Parent p = new Parent();
		p.property();
		p.marry();

		String str1 = "durga";
		String str2 = 40 + 50 + str1 + "ratan" + 60 + 70;
		System.out.println(str2);

		String str = "hi rattaiah how r u";
		String[] str11 = str.split(" ");
		for (int i = 0; i < str11.length; i++) {
			System.out.println(str11[i]);
		}

		System.out.println(str.getBytes());

		String s = "  ratan  ";
		System.out.println(s.trim().length());

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.endsWith("sdj"));
		System.out.println(s.startsWith(""));

		String str111 = "Geeks", nstr = "";
		char ch;

		System.out.print("Original word: ");
		System.out.println("Geeks"); // Example word

		for (int i = 0; i < str111.length(); i++) {
			ch = str111.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
			System.out.println(nstr);
		}
		System.out.println("Reversed word: " + nstr);

		Integer i = new Integer(100);
		System.out.println(i.toString());

		float f = 10.7f;
		Float f1 = new Float(f);
		System.out.println(f1);

		String q = "100";
		int a = Integer.parseInt(q);
		System.out.println(a);

		print(i);
		System.out.println(j);

	}

	static void print(int i) {
		j = i;
		System.out.println(j);
	}
	
	String name = "Victor Frankenstien";
//	name = name.
			

}
