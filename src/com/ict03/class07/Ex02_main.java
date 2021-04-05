package com.ict03.class07;

import com.ict03.class07.Ex02.Inner01;

public class Ex02_main {
	public static void main(String[] args) {
		
		Ex02 t1 = new Ex02();
		//외부를 통해서 내부클래스 생성
		//내부클래스 주소에는 '$'이 있다.Ex02$Inner01@5d22bbb7
		Ex02.Inner01 t2 = t1.new Inner01();
		
		System.out.println(t2.name);
		System.out.println(t2.i2);
		System.out.println(t2.i4);
		System.out.println();
		t2.play();
	}
}
