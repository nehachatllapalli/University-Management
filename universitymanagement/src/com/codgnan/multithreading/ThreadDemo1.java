package com.codgnan.multithreading;

class MyThreads extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(1000);
				
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
	
public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException{
		MyThread1 t=new MyThread1();
		t.start();
		t.join();
		for(int i=0; i<10; i++) {
			System.out.println("Ram Thread");
		}
		
	}

}


