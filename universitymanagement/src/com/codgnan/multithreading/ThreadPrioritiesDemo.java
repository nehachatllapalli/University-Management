package com.codgnan.multithreading;

class MyThread1 extends Thread{
	
}
public class ThreadPrioritiesDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		MyThread1 t=new MyThread1();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(0);
		System.out.println(Thread.currentThread().getPriority());
		
	}

}
