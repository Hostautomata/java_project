package com.ict01.garmmar03;
//D = A(boolean �ڷ���) ? B : C;
//D : ������ ���� A : ���ǽ� ? : ���� �� ������ ���� C : �����϶� ������ ����
//D, B, C�� �ڷ����� ���߾�� �Ѵ�.
class Ex04{
	public static void main(String[] args){
		int result = true ? 14 : 10;
		System.out.println("���: "+result);	
		
		result = false ? 14 : 10;
		System.out.println("���: "+result);	
		
		int result2 = false ? 14 : 'C';
		System.out.println("���: "+result2);	
		System.out.println("���: "+(char)(result2));	

		
		int sum = 81;
		String result3 = (sum >= 80) ? "�հ�" : "���հ�";
		System.out.println("���: "+result3);	

		double avg = 87.0;
		double result4 = (avg >= 90) ? 'A' : 'B';
		System.out.println("���: "+result4+" "+(char)(result4));	
		
			
		
	}
}