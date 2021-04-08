package com.ict06.thread;
//스레드는 start()에서 run()으로 이동해야 스레드처리됨

//		start()에서 start() 스레드X
//		run() 에서 run() 스레드 X
//스레드 실행은 Thread클래스를 상속, Runnable 인터페이스 상속
//스레드 클래스는 start(), run() 모두 가지고 있다.
//Runnable 인터페이스는 run()만 가지고있다.따라서 Thread를 상속해서 받아와야 한다.

public class Ex03 extends Thread {
	public void go() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
//	@Override
//	public void start() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName()+":"+i);
//		}
//	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}

