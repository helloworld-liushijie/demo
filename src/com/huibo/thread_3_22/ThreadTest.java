package com.huibo.thread_3_22;

public class ThreadTest {
	
	public static void main(String[] args) {
		Buy buy = new Buy();
		Thread t1 = new Thread(buy);
		Thread t2 = new Thread(buy);
		t1.start();
		t2.start();
	}
}

class Buy implements Runnable {
	
	int num = 100;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(num > 0) {
			synchronized (this) {
				notify();
				System.out.println(Thread.currentThread()+":"+num);
				num--;
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
