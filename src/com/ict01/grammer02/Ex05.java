package com.ict01.grammer02;
class Ex05{
	public static void main(String[] args){
	//String 참조자료형이지만 기본자료형처럼 사용
		String str = "Hello Java";
		System.out.println(str);	

		String k1 = "1000";
		int k2 = 1000;
		System.out.println(k1+10);
		System.out.println(k2+10);

		int s1 = 20;
		int s2 = 4;
		System.out.println(s1+s2);
		System.out.println("결과: " + s1 + s2);
		System.out.println("결과: " + (s1 + s2));	
		
	}
}