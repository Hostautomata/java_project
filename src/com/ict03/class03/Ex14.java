package com.ict03.class03;

public class Ex14 {
	
	String name = "홍길동";
	int age = 27;
	
	/*
	public Ex14() {
		System.out.println("부모클래스 "+this.name+" 생성");
		age = 17;
	}
	*/
	
	public Ex14(String name, int age) {
		super();//Object
		this.name = name;
		this.age = age;
	}
	
	
}