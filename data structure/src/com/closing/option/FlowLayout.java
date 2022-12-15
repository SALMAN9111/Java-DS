package com.closing.option;

import java.awt.*;

class FlowLayout extends Frame {

	Button b1, b2, b3, b4, b5;

	public FlowLayout() {

//		this.setBackground(Color.green);
//		this.setSize(400, 400);
//		this.setVisible(true);
//		this.setLayout(new BorderLayout());
//		this.setLayout(new CardLayout());
//		b1 = new Button("Boys");
//		b2 = new Button("Girls");
//		b3 = new Button("management");
//		b4 = new Button("Teaching Staff");
//		b5 = new Button("non-teaching staff");
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("rattaiah");
		this.setBackground(Color.red);
		this.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < 10; i++) {
			Button b = new Button("" + i);
			this.add(b);
		}
//		this.add("North", b1);
//		this.add("Center", b2);
//		this.add("South", b3);
//		this.add("East", b4);
//		this.add("West", b5);

	}
}
