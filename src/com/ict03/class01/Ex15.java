package com.ict03.class01;

public class Ex15 {
	int s1 = 100;
	//초기화 전 데이터는 초기화를 만나면 없어진다.
	static int s2 = 200;
	//static 초기화
	static {
		s2 = 2000;
		s3 = 3000;
		s4 = 4000;
	}
	//static은 초기화 이후에 선언을 해도 오류 발생하지 않음.
	static int s3 = 300;
	static int s4;
	
	
	
	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		//main()도 static이므로 전역변수가 instance이면 사용할 수 없다.
		//System.out.println(s1);
		System.out.println(t1.s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	
}
