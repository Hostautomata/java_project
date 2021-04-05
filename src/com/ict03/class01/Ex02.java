package com.ict03.class01;

public class Ex02 {
	
	//클래스 안에는 세가지가 존재한다.
	// 맴버 필드, 맴버 메서드, 생성자
	//맴버 필드 : 상수와 변수, static과 instance로 나뉨.
	int k1 = 80;				//인스턴스 변수
	static int k2 = 90;			//static변수
	final int K3 = 85;			//인스턴스 상수
	static final int K4 = 95;	//static 상수 = API에서 제공하는 상수 형태
	//클래스가 객체로 만들어질 때 같이 만들어짐 : instance
	//객체 생성과 관련없이 미리 만들어지는 것
	//메서드는 자기를 호출한 곳으로 되돌아간다.(main->jvm)	
	//맴버 메서드 : 동작, 기능
		
	public void prn01(){//instance, 반환X
		
		k1 = k1 + 20;
		k2 = k2 + 10;
		
		System.out.println("k1 = "+k1);
		System.out.println("k2 = "+k2);
//		final이 붙으면 상수이다. 상수는 값 변경을 할 수 없다. 따라서 오류 발생
//		K3 = K3 + 15; 
//		K4 = K4 + 5;
		
		//지역변수 : 메서드 안에서 만들어진 변수
		//			메서드 안에서 만들어진 변수는 메서드를 호출 할 때 생성된다. 
		//			메서드가 끝나면 사라진다.
		//			지역변수는 static을 만들 수 없다.(static은 객체와 관련없이 미리 만들어야 하기 때문에)
		int s1 = 10;
//		static int s2 = 90;
		final int s3 = 85;
//		static final int s4 = 95;
		
	}
	public static void prn02() {//static, 반환X
//		static메서드에서는 인스턴스 변수를 사용 할 수 없다.
//		k1 = k1 + 20;
		k2 = k2 + 10;
//		K3 = K3 + 15;
		
		System.out.println("k2 = "+k2+", K4 = "+K4);
//		지역변수는 static을 만들 수 없다.
		int s1 = 10;
//		static int s2 = 90;
		final int s3 = 85;
//		static final int s4 = 95;
		
		return ;//반환은 할 수 있으나 데이터는 반환되지 않음
	}
	//static유무, void유무
	public int prn03() {//instance, 반환O
		//return 14; //반환형보다 작거나 같은 자료형을 사용하여야 한다.
		return 'c';
		
	}
	public static double prn4() {//static, 반환O
		return 147;
		//return 3.14;
	}
}
