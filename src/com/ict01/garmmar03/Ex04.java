package com.ict01.garmmar03;
//D = A(boolean 자료형) ? B : C;
//D : 저장할 변수 A : 조건식 ? : 참일 때 실행할 문장 C : 거짓일때 실행할 문장
//D, B, C의 자료형을 맞추어야 한다.
class Ex04{
	public static void main(String[] args){
		int result = true ? 14 : 10;
		System.out.println("결과: "+result);	
		
		result = false ? 14 : 10;
		System.out.println("결과: "+result);	
		
		int result2 = false ? 14 : 'C';
		System.out.println("결과: "+result2);	
		System.out.println("결과: "+(char)(result2));	

		
		int sum = 81;
		String result3 = (sum >= 80) ? "합격" : "불합격";
		System.out.println("결과: "+result3);	

		double avg = 87.0;
		double result4 = (avg >= 90) ? 'A' : 'B';
		System.out.println("결과: "+result4+" "+(char)(result4));	
		
			
		
	}
}