package com.ict01.grammer02;
class Test01{
	public static void main(String[] args){
		//이름이 홍길동인 사람의 국어:90 영어:80 수학:90
		String name = "홍길동";
		double ko = 90.0;
		double en = 80.0;
		double ma = 90.0;
		
		int sum = (int)(ko+en+ma);

		double av = sum/3;
		double avr = (int)(av*10)/10.0;
		System.out.println("이름: "+name);
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avr);
		
	}
}