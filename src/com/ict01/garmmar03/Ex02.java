package com.ict01.garmmar03;
class Ex02{
	public static void main(String[] args){
		int s1 = 10;
		int s2 = 7;

		boolean result = false||false;
		System.out.println("결과 : "+result);

		result = (s1 >= 15) || (s2 <= 5);
		System.out.println("결과 : "+result);

		result = true||false;
		System.out.println("결과 : "+result);
		
		result = (s1 >= 15) || (s2 >= 5);
		System.out.println("결과 : "+result);

		result = ((s1 = s1+2)>20) || (s1 == (s2 = s2 + 5));
		System.out.println("결과 : "+result);
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);

		result = ((s1 = s1+2)<20) || (s1 == (s2 = s2 + 5));
		System.out.println("결과 : "+result);
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);

		result = true;
		System.out.println(!result);
		System.out.println(!!result);
		System.out.println(!!!result);
		
	}
}