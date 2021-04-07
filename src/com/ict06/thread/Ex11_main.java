package com.ict06.thread;

import java.util.Iterator;

public class Ex11_main {
	public static void main(String[] args) {
		//Demon스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
		//				일반스레드가 종료되면 Demon스레드는 강제로 종료됨
		//			
		
		System.out.println(Thread.currentThread().getName()+": 시작");
		Ex10 t1 = new Ex10();
		Ex11 t2 = new Ex11();
		Thread thread1 = new Thread(t1);
		thread1.setDaemon(true);;
		
		Thread thread2 = new Thread(t2);
		thread2.setDaemon(true);;
		
		thread1.start();
		thread2.start();
		
		
		
		for (int i = 0; i < 51; i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
		 System.out.println(Thread.currentThread().getName()+" 끝");
		
	}
}
