package com.ict01.grammer02;
class Ex04{
	public static void main(String[] args){
	//����ȯ ���� �ڷ����� ū �ڷ������� �ٲٴ� ���� ���θ��(�ڵ� ����ȯ)
	//ū �ڷ����� ���� �ڷ������� ��ȯ�ϴ� ���� ����(���� ����ȯ)
	//byte short char int long float double
		
		int s1 = 'a';
		System.out.println(s1);		

		char c1 = 'a';
		System.out.println(c1);		

		int s2 = c1;
		System.out.println(s2);

		double s3 = s1;
		System.out.println(s3);
		

		//���� ����ȯ =�� �������� ������ ���� �ڷ����� �����.
		
		byte k1 = (byte)129;//-128~127�̹Ƿ� ���� �ʰ��Ǹ� -128�ΰ���.
		System.out.println(k1);
		char k2 = 97;
		System.out.println(k2);
		int k3 = 97;
		char k4 = (char)k3;
		System.out.println(k4);
				
		//float�� double�� int�� ����
		int k5 = (int)87.64;
		System.out.println(k5);		
	}
}