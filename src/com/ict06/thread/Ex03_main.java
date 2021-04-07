package com.ict06.thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		// 스레드 처리를 위해서 start() -> run()으로가야하나
		//start()메서드가 있어서 start()로 간다.
		//start()에서 start() 스레드X
		//Ex03의 start()를 주석처리하면 
		//start()에서 run()으로 가게 된다.
		//이것을 스레드처리했다고 한다.

		t1.go();
		System.out.println("수고하셨습니다.");

		System.out.println("start===========");
		System.out.println(Thread.currentThread().getName());
	
		t1.start();
		System.out.println("수고하셨습니다.");

		System.out.println("===========");
	}
}

