package com.ict06.thread;

public class Ex07 implements Runnable {
	@Override
	public void run() {
		while (true) {
		System.out.println(Thread.currentThread().getName()+"1111111111");
		}
	}
}
