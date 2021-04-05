package com.ict01.garmmar03;
class Ex01{
	public static void main(String[] args){
		boolean result  = true && true;
		System.out.println(result);
		
		int s1 = 10;
		int s2 = 7;
		char c1 = ' ';
		result = (s1 >= 7)&&(s2 >= 5);
		System.out.println(result);

		result = false && true;
		System.out.println(result);

		result = (s1 <= 7)&&(s2 >= 5);
		System.out.println(result);

		result = ((s1 = s1 + 2) > s2)&&(s1 == (s2 = s2 + 5));
		System.out.println(result);
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		result = ((s1 = s1 + 2) < s2)&&(s1 == (s2 = s2 + 5));
		System.out.println(result);
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);//false를 만났기 때문에 뒤에 (s1 == (s2 = s2 + 5))가 무시되었다.
	
	result = (c1 >= 'a')&&(c1 <= 'z');
	System.out.println("결과 : "+result);
	}
}