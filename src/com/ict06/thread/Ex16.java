package com.ict06.thread;


//문제 : 두개의 스레드를 생성하여 첫번째 스레드의 출력을 1~50까지 출력하고
//		두번째 스레드의 출력은 51~100까지 출력하고(synchronized 사용)
//		다시 첫번째 스레드의 출력을 101~150까지 출력
//		두번째 스레드가 151~200까지 출력(synchronized, wait, notify 사용)
public class Ex16 implements Runnable{

	int x=0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(++x));
			if(x == 50) {
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}else if(x == 100){
				
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}else {
				notify();
			}
				
			
		}
		
		
	}
	
}
