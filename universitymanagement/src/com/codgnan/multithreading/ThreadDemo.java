package com.codgnan.multithreading;

class MyThread extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			
			Thread.yield();
			System.out.println("child Thread");
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		
	}

}
