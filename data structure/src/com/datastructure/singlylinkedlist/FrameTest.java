package com.datastructure.singlylinkedlist;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;

public class FrameTest extends Frame {
	public static void main(String[] args) {
		// frame creation
//		Frame f = new Frame();
//		set visibility
//		f.setVisible(true);
		// set the size of the frame
//		f.setSize(400, 400);
		// set the background
//		f.setBackground(Color.red);
		// set the title of the frame
//		f.setTitle("myframe");
//		f.paint(arg0);

//		Frame f = new Frame();
//		f.setVisible(true);
//		f.setTitle("ratan");
//		f.setBackground(Color.red);
//		f.setSize(400, 500);
//		f.setLayout(new FlowLayout());
//		Label l = new Label("user name:");
//		TextArea tx = new TextArea(4, 10);// 4 character height 10 character width
//		tx.appendText("ratan");
//		tx.setText("aruna");
//		System.out.println(tx.getText());
//		f.add(l);
//		f.add(tx);

//		Choice ch = new Choice();
//		ch.add("c");
//		ch.add("cpp");
//		ch.add("java");
//		ch.add(".net");
//		ch.remove(".net");
//		ch.remove(0);
//		ch.insert("ratan", 0);
//		f.add(ch);
//		System.out.println(ch.getItem(0));
//		System.out.println(ch.getSelectedItem());
//		System.out.println(ch.getSelectedIndex());
		// ch.removeAll();
		
//		List l1=new List(4,true);
//		l1.add("c");
//		l1.add("cpp");
//		l1.add("java");
//		l1.add(".net");
//		l1.add("ratan");
//		l1.add("arun",0);
//		l1.remove(0);
//		f.add(l1);
//		System.out.println(l1.getSelectedItem());
		
//		Frame f1=new Frame();
//		f1.setVisible(true);
//		f1.setTitle("ratan");
//		f1.setBackground(Color.red);
//		f1.setSize(400,500);
//		Checkbox cb1=new Checkbox("BTECH",true);
//		f1.add(cb1);
//		System.out.println(cb1.getLabel());
//		System.out.println(cb1.getState());
		
//		CheckboxGroup cg=new CheckboxGroup();
//		Checkbox cb=new Checkbox("male",cg,true);
////		f.add(cb);
//		System.out.println(cb.getLabel());
//		System.out.println(cb.getState());
		
		Frame f=new Frame();
		f.setVisible(true);
		f.setTitle("ratan");
		f.setBackground(Color.red);
		f.setSize(400,500);
		f.setLayout(new FlowLayout());
		Label l1=new Label("user name:");
		TextField tx1=new TextField();
		System.out.println();
		Label l2=new Label("password:");
		TextField tx2=new TextField();
		Button b=new Button("login");
		f.add(l1);
		f.add(tx1);
		f.add(l2);
		f.add(tx1);
		f.add(b);
	}

}
