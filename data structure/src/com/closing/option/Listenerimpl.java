package com.closing.option;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Listenerimpl extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
