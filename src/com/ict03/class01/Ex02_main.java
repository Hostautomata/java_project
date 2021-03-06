package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {
		//static 변수들은 객체 생성과 상관없이 미리 만들어진다.
		//호출은 클래스이름.메서드, 클래스이름.변수
		//System.out.println(Ex02.k1);//인스턴스
		System.out.println(Ex02.k2);
		//System.out.println(Ex02.K3);//인스턴스
		System.out.println(Ex02.K4);
		
		//반환형에 따라서 받는 방법이 달라진다.
		//void의 경우 데이터가 넘어오지 않기 때문에 받을 필요가 없다.
		Ex02.prn02();
		
		//void가 아닐 경우 반드시 반환형에 맞춰서 저장하자.
		double su1 = Ex02.prn4();
		System.out.println(su1);
		System.out.println("--객체 생성 전후--");
		
		//1.Ex02 클래스를 사용하기 위해서 클래스를 객체로 만들어야 함.
//		Ex02클래스는 생성자가 존재하지 않으므로 기본생성자로 객체생성
//		기본생성자란 인수=매개변수가 없는 생성자를 의미(클래스이름())
		//클래스 참조변수 = new 생성자();
		Ex02 test = new Ex02();
		//주소
		System.out.println(test);	
		System.out.println(test.k1);
		System.out.println(test.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		
		//메서드 실행
		
		test.prn01();
		
		test.prn02();
		Ex02.prn02();
		
		int su2 = test.prn03();
		System.out.println(su2);
		
		double su3 =test.prn4();
		double su4 = Ex02.prn4();
		
		System.out.println(su3);
	}
}
//1. main이 실행된다 static영역에서 static메서드와 변수를 정의한다.
//2. 클래스를 이용해서 객체를 만든다.
//3. Heap영역에서 instance변수들을 정의한다.
//4. Heap영역에서 Static영역의 중복되는 변수들의 주솟값을 연결한다.