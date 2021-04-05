package com.ict03.class03;

public class Ex11_Dog extends Ex09_Animal{
	String name = "댕댕이";
	int age = 3;
	
	public void hobby() {
		System.out.println("신발 물어 뜯기");
	}
	@Override//어노테이션(의미있는 주석 JVM도 인식함)
	public void sound() {
		System.out.println("왈왈");
		super.sound();
	}
}
