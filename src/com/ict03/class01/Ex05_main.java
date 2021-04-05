package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {

		System.out.println(Ex05.s3);
		//s4는 static이라도 private은 접근할 수 없다.
		//System.out.println(Ex05.s4);
		
		Ex05 test = new Ex05();
		System.out.println(test.s1);
		//private이기 때문에 s2에 접근할 수 없다.
		//System.out.println(test.s2);
		System.out.println(test.s3);
		
		//메서드들도 마찬가지
		test.add();
		//접근이 안됨.
		//test.add2();
		//우회
		test.add3();
		
		
	}
}
