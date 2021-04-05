package com.ict01.grammer02;
class Ex04{
	public static void main(String[] args){
	//형변환 작은 자료형을 큰 자료형으로 바꾸는 것을 프로모션(자동 형변환)
	//큰 자료형을 작은 자료형으로 변환하는 것을 디모션(강제 형변환)
	//byte short char int long float double
		
		int s1 = 'a';
		System.out.println(s1);		

		char c1 = 'a';
		System.out.println(c1);		

		int s2 = c1;
		System.out.println(s2);

		double s3 = s1;
		System.out.println(s3);
		

		//강제 형변환 =를 기준으로 무조건 왼쪽 자료형에 맞춘다.
		
		byte k1 = (byte)129;//-128~127이므로 값이 초과되면 -128로간다.
		System.out.println(k1);
		char k2 = 97;
		System.out.println(k2);
		int k3 = 97;
		char k4 = (char)k3;
		System.out.println(k4);
				
		//float나 double을 int로 저장
		int k5 = (int)87.64;
		System.out.println(k5);		
	}
}