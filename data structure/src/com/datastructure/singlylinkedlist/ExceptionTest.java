package com.datastructure.singlylinkedlist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) throws InterruptedException {
		int a;
		int b;
		int[] a1 = new int[100];
		
		
//		MyThread t1 = new MyThread();
		MyThread t1=new MyThread();
//		MyThread t2=new MyThread();
//		System.out.println("T1 Name : "+t1.getName());
		t1.start();
		t1.interrupt();
//		t1.join();
//		System.out.println(t1.isAlive());
//		t2.start();
//		Thread t1 = new Thread(t);
//		t1.setName("MAVERICK");
//		t1.setPriority(1);
////		t1.setPriority(t1.getPriority()+5);
////		t1.setPriority(Thread.MAX_PRIORITY);
//		t1.setPriority(Thread.MIN_PRIORITY);
//		
//		System.out.println(t1.getPriority());
//		System.out.println(t1.getName());
////		t1.sleep(5*1000);
//		t1.start();
//		System.out.println(Thread.activeCount());

		System.out.println("Enter two number to perfrom Division");
		Scanner sc = new Scanner(System.in);
		
		
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			
			int ans = a / b;
			System.out.println("Ans : " + ans);
		}

		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException n) {
			System.out.println(n.getMessage());
		}

//		main(args);

	}

}
