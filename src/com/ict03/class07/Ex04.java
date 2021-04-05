package com.ict03.class07;
//3. Static 내부 클래스
public class Ex04 {
	String name = "홍길동";
	private int age = 24;
	static String addr = "제주도";
	
	public Ex04() {
		System.out.println("외부 클래스의 생성자 : "+this);
	}
	public void sound() {
		int money = 1000;
		final int time = 2;
		//지역변수는 static을 못씀
//		static int number = 12;
//		static final int number2 = 12;
		System.out.println("외부 클래스의 메서드 : "+name+", money: "+money);
		
	}
	public static class Inner03{
		String name = "홍일점";
		final int i2 = 10;
		//내부클래스에서는 static을 못붙임 -> 꼭 붙여야 겠다면 static내부클래스 사용
		static int i3 = 20;
		static final int i4 = 30;
		//내부 클래스 생성자
		public Inner03() {
			System.out.println("내부클래스 생성자"+this);
		}
		//내부클래스는 외부클래스의 맴버 필드와 메서드를 마음대로 사용가능하다.
		//내부 클래스 메서드
		public void play() {
			int money = 10000;
			System.out.println("이름: "+name);
			System.out.println("금액: "+money);
			//외부클래스의 필드 static을 붙여야 한다.
			//System.out.println("나이: "+age);
			System.out.println("주소: "+addr);
			//외부 클래스 메서드
			//sound();
		}
	}
	
}
