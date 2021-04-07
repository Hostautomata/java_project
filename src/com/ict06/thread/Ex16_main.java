package com.ict06.thread;

public class Ex16_main {

	public static void main(String[] args) {
		Ex16 t1 = new Ex16();
		new Thread(t1,"1번째").start();
		new Thread(t1,"2번째").start();
		
	}

}
