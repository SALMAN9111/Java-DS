package com.datastructure.singlylinkedlist;

public class MyThread extends Thread {
//public class MyThread implements Runnable {

//	@Override
	public void run() {
		System.out.println("Tread is running");
		try {
//			Thread.yield();
//			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 10; i++) {
				System.out.println("rattaiah");
				Thread.sleep(3 * 1000);
			}
		} catch (InterruptedException ie) {
			System.out.println("I got interupted by interupted call");
		}
		System.out.println("child thread");

	}
//	public void run() {
//		System.out.println("Thread is running");*
//	}

}
