package com.ict03.class01;

public class Ex14 {
	//static :객체 생성과 관련없이 미리 만들어지는 메서드
	//		  클래스와 지역변수에서는 static을 사용할 수 없다.
	//		  모든 객체나 클래스가 사용할 수 있다.
	//		  접근제한자가 private이면 static도 접근할 수 없다.
	
	int su1 = 10;
	static int su2 = 10;
	
	public Ex14() {
		su1++;
		su2++;
		
	}
	public void prn() {
		int su3 = 10;
		//static int su4 = 10;//지역변수에는 static을 사용할 수 없다.
		
	}
	//static 메서드는 static 변수와 참조할 수 있다.
	public static void prn2() {
//		System.out.println(su1);static메서드는 instance변수를 사용할 수 없다.
		System.out.println(su2);
		int su4  = 10;
//		static int su5 = 10;//지역변수에는 static을 사용할 수 없다.
	}
}
