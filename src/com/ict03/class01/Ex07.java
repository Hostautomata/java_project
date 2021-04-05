package com.ict03.class01;

public class Ex07 {
	private String name = "둘리";
	private int age = 13;
	private double height = 135.15;
	private boolean human = false;
	private char rank = 'A';

	//getter/setter 호출 => 메뉴-Source->generate getter&setter
	//*VO(value object 값들을 모은 객체)에 주로사용
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}//전역변수(파랑)와 지역변수(노랑)의 이름이 같을 경우 this가 없으면 이를 구분할 수 없음.
	//따라서 전역변수에 this를 붙임.
	//지역변수와 전역변수의 이름이 같을 때 우선순위는 지역변수가 높다.
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isHuman() {//API를 참조하기 때문에 boolean형만 get이 아니라is가 붙는다.
		return human;
	}
	public void setHuman(boolean human) {
		this.human = human;
	}
	public char getRank() {
		return rank;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
	
}
