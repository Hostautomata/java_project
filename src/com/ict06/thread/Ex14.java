package com.ict06.thread;

public class Ex14 implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {
		for(int i =0; i < 50; i ++) {
			System.out.println(Thread.currentThread().getName()+":"+(++x));
			//
			if(x == 25) {
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
	//동기화 처리할 때 실행중인 스레드를 강제로 대기상태로 변경시키는 메서드
	//wait()(재운다)
	// 한번 wait()를 호출한 객체는 notify()로 깨워주지 않으면 그대로 대기
	//그 상태로 프로그램이 종료된다.
	//notify(),notifyAll()
	
}
