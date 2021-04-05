package com.ict03.class06;
enum Type{
	WALKING, RUNNING, TRACKING, HIKING
}
public class Ex02 {
	String name ;
	int size;
	Type type;//enum을 자료형으로 만듦.

	public static void main(String[] args) {
		//객체를 만들면 클래스의 맴버변수를 사용할 수 있다.
		Ex02 shose = new Ex02();
		shose.name = "나이키";
		System.out.println(shose.name);
		
		shose.size = 275;
		shose.type = Type.RUNNING;
		System.out.println("신발 이름 : "+shose.name);
		System.out.println("신발 사이즈 : "+shose.size);
		System.out.println("신발 타입 : "+shose.type);
	}
}
