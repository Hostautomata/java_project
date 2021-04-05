package com.ict03.class07;

public class Ex03_main {
	public static void main(String[] args) {
		//별도로 객체 생성 불가.
		//Member내부클래스처럼 객체생성 못함
		//Ex03 t1 = new Ex03();
		//Inner02 t2 = t1.new Inner02();
		Ex03 t1 = new Ex03();
		
		//내부클래스가 포함된 메서드를 실행해야 내부 클래스를 만들 조건이 된다.
		//내부클래스의 끝과 내부클래스를 가진 메서드의 끝 사이에서 객체를 생성해야 함.
		
		t1.play();
		
	}
}
