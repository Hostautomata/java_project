package com.ict03.class01;

public class Ex06 {
	private String name = "홍길동";
	private int age = 24;
	private double height = 180.03;
	private char rank = 'A';

	//private 변수에 접근하기 위해서는 메서드를 사용해야 한다.
	//이름 반환하기
	//getter 메서드
	public String k1() {
		return name;
	}
	public int k2() {
		return age;
	}
	public double k3() {
		return height;
	}
	public char k4() {
		return rank;
	}
	//변수에 접근해서 해당 변수의 데이터를 변경할 때 사용
	//*setter    
	//생성자의 목적이 변수값을 초기화 하는데에 있다.(생성자도 값변경 가능)
	
	
	public void m1(String t1) {
		name = t1;
	}
	public void m2(int t1) {
		age = t1;
	}
	public void m3(double t1) {
		height = t1;
	}
	public void m4(char t1) {
		rank = t1;
	}
	
}

