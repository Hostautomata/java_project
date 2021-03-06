package com.ict03.class01;

public class Ex13 {
	
	private String name = "희동이";
	private int age = 3;
	private String addr = "서울";
	
	//생성자 오버로딩
	//기본생성자 : ctrl + space bar
	public Ex13(){
		//this : class안에서 자기 자신을 지칭하는 예약어
		//this 변수 : 전역변수
		//this() : 생성자가 생성자를 호출할 때 사용하는 예약어이다.
		//		   반드시 생성자 첫 줄에만 사용 가능하다.
		this("공실이",21,"남극");	
		System.out.println("기본생성자 : "+this);
		//System.out.println(this.name);
	}
	//메서드나 생성자(지역변수)는 호출을 해야 만들어진다.
	
	public Ex13(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Ex13(int age, String name) {
		this(name, age,"남극");
	}

	public Ex13(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("4번째 생성자");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
