package com.ict06.thread;

public class Ex06_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex04 t1 = new Ex04();
		Ex05 t2 = new Ex05();
		Ex06 t3 = new Ex06();

		// 스레드처리가 아니므로 메인이1에 묶임
//		t1.run();
//		t2.run();
//		t3.run();
		// 스레드처리 병렬
		t1.start();
		t2.start();
		t3.start();
	}
}
