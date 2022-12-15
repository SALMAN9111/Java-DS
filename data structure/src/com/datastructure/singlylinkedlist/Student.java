package com.datastructure.singlylinkedlist;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
	private int rollNO;
	private String name;

	public Student(int rollNO, String name) {
		this.rollNO = rollNO;
		this.name = name;
	}

	public int getRollNO() {
		return rollNO;
	}

	public String getName() {
		return name;
	}
}
