package com.closing.option;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener extends Frame implements ActionListener {

	TextField tx1, tx2, tx3;
	Label l1, l2, l3;
	Button b1, b2;
	int result;

	public Listener() {
		this.setSize(250, 400);
		this.setVisible(true);
//		Listener.setLayout( new FlowLayout())	;
		l1 = new Label("first value");
		l2 = new Label("second value");
		l3 = new Label("result");
		tx1 = new TextField(25);
		tx2 = new TextField(25);
		tx3 = new TextField(25);
		b1 = new Button("add");
		b2 = new Button("mul");
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.add(l1);
		this.add(tx1);
		this.add(l2);
		this.add(tx2);
		this.add(l3);
		this.add(tx3);
		this.add(b1);
		this.add(b2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			int fval=Integer.parseInt(tx1.getText());
			int sval=Integer.parseInt(tx2.getText());
			String label=e.getActionCommand();
			if (label.equals("add"))
			{
			result=fval+sval;
			}
			if (label.equals("mul"))
			{
			result=fval*sval;
			}
			tx3.setText(""+result);
			}
			catch(Exception ee)
			{
			ee.printStackTrace();
			}
		
	}
}
