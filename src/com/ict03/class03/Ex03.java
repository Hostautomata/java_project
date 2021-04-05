package com.ict03.class03;

public class Ex03 extends Ex02{
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";

	public Ex03() {
		//super();숨어있음
		System.out.println("자식 클래스 생성자"+this);
	}
	public void sound() {
		System.out.println("자식 클래스 메서드");
	}
	public void study() {
		//객체 생성 없이 부모클래스의 맴버를 사용한 것
		System.out.println("공부장소 : "+addr);
		//지역변수에 있는지 없는지 판단 -> 전역변수에 있는지 없는지 판단 -> 상속관계 클래스 확인
		System.out.println("name : "+this.name);//차두리
		System.out.println("super name : "+super.name);//차범근
		
		//System.out.println(dog); 상속관계여도 private은 사용할 수 없다.
	}
	//오버라이딩(재정의) : 부모 메서드를 겉모양은 그대로 사용하는 것
	//오버라이딩을 할수 없게 만드는 예약어 : final 
	//부모메서드에 final이 있으면 오버라이딩을 할 수 없다.
	//오버라이딩의 반대는 final
	
	//완전히 다른 개념임.
	//오버로딩 : **생성자**가 매개변수를 다양하게 받아서 하나의 메서드를 다양하게 정의하는 것
	@Override
	public void eat() {
		System.out.println("아침식사는 거른다.");
	}
	
	

}
