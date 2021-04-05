package com.ict03.class01;

public class Ex05 {
	//접근제한자 : 외부에서 접근하여 사용할 수 있는 단계를 구분
	//public, protected, default, private
	//public 	: 누구나 다 
	//protected : 같은 패키지나 상속관게인 패키지
	//default	: 같은 패키지
	//private	: 외부 접근 금지

	public int s1 = 10;
	private int s2 = 20;
	public static int s3 = 30;
	private static int s4 = 40;
	
	
	public void add() {
		s1 += 10;
		s2 += 10;
		s3 += 10;
		s4 += 10;
	}
	
	private void add2() {
		s1 += 10;
		s2 += 10;
		s3 += 10;
		s4 += 10;
	}
	//메서드가 메서드 호출 가능
	void add3() {
		add2();
	}
	
	
	
}
