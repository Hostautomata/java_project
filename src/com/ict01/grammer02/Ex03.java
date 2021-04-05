package com.ict01.grammer02;
class Ex03{
	public static void main(String[] args){
		//정수형 byte short int long
		//java는 32bit처리를 하기 때문에 byte와short를 계산하면 무조건 int이상이다.
		byte s1 = -127; //byte = -128~127
		System.out.println(s1);
		s1 = -128;
		System.out.println(s1);
//		s1 = -129;  
//		System.out.println(s1);
//		short s2 = 32760+100; //short = -32768~32767
//		System.out.println(s2);
		int s3 = 117;
		System.out.println(s3);
		long s4 = 117L;
		System.out.println(s4);
		long s5 = 117l;
		System.out.println(s5);
		long s6 = 117;
		System.out.println(s6);	
		float s7 = 3.14f;//float 는 숫자뒤에 F또는f를 붙인다.(생략 안됨)	
		System.out.println(s7);	
		double s8 = 3.14;
		System.out.println(s8);	
		double s9 = 117;
		System.out.println(s9);	
		

	}
}