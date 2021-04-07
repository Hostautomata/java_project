package com.ict06.thread;

public class Ex09_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();

		// Ex07, Ex08, Ex09는 Runnable을 상속받았기 때문에
		// start()가 없다.
		// t1.start();로 사용 불가.

		// 실행 run메서드를 가진 클래스. 즉, 타겟지정을 해야한다.
		// Thread thread1 = new Thread();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		thread1.start();
		thread2.start();
		thread3.start();
		new Thread(t2).start();

		// 안드로이드에서 많이 사용하는 방법(익명 내부클래스)
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + ":" + "ㅁㅁㅁㅁ");
				}
			}
		}).start();
		
	}
}
