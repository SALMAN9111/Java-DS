package com.datastructure.singlylinkedlist;

@SuppressWarnings("serial")
public class KeyNotPresentException extends RuntimeException {
	String build = "Then given KEY is not present in List";

	public String getMessage() {
		return build;
	}
}
