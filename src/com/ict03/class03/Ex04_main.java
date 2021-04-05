package com.ict03.class03;

public class Ex04_main {
	public static void main(String[] args) {
		Ex03 t1 = new Ex03();
		//부모클래스가 먼저 만들어지고
		//자식클래스가 만들어짐
		//super();로 부모 클래스 호출
		//그 뒤 
		System.out.println(t1);
		//부모와 자식이 같은 것을 가지고 있으면
		//자식의 맴버를 먼저 사용
		System.out.println(t1.name);
		//자식에게 없는 맴버는 부모에게 있는 맴버 사용
		System.out.println(t1.addr);
		
		//메서드도 마찬가지이다.
		t1.sound();
		t1.prn();
		System.out.println("--------------");
		//static 객체생성과 관련 X
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		//자식과 부모가 같은 메서드를 가지고 있으면 
		//자식 메서드를 실행한다.
		t1.eat();
		t1.walk();
	}
}
