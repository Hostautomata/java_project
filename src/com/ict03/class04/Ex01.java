package com.ict03.class04;

public abstract class Ex01 {
	//추상 클래스 : 추상메서드를 하나이상 가지고 있는 클래스
	//			일반적인 메서드나 필드도 가질 수 있다.
	//			추상클래스는 abstract 예약어를 사용한다.
	
	//틀을 뿌릴때 사용
	
	//추상 메서드 : 구체화 되지 않은 메서드
	//			body 블럭이 존재하지 않는 메서드
	//			= 실행문이 없다.=구체화 되지 않았다.
	//			추상메서드에는 반드시 abstractd예약어를 사용한다.
	
	// 다형성 : 하나의 메서드나 클래스가 있을 때 이 것들을 다양한 방법으로 동작 시키는 것
	int s1 =10;					//인스턴스변수
	static int s2 = 10;			//static변수
	final int s3 = 10;			//인스턴스상수
	static final int s4 = 10;	//static상수
	
	public void play() {
		System.out.println("인스턴스 메서드");
	}
	public static void prn() {
		System.out.println("static메서드");
	}
	//추상 메서드
	public abstract void sound();
	
	
	
	
}
