package com.datastructure.singlylinkedlist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDeserialTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student = new Student(1, "Frank");

		FileOutputStream fos = new FileOutputStream("student/student.txt");
		ObjectOutputStream obs = new ObjectOutputStream(fos);
		obs.writeObject(student);

		System.out.println(obs);
		obs.flush();

		FileInputStream fis = new FileInputStream("Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student) ois.readObject();
		System.out.println(s.getName());
		System.out.println(s.getRollNO());
	}
}
