package com.ict03.class01;

public class Ex14 {
	//static :��ü ������ ���þ��� �̸� ��������� �޼���
	//		  Ŭ������ �������������� static�� ����� �� ����.
	//		  ��� ��ü�� Ŭ������ ����� �� �ִ�.
	//		  ���������ڰ� private�̸� static�� ������ �� ����.
	
	int su1 = 10;
	static int su2 = 10;
	
	public Ex14() {
		su1++;
		su2++;
		
	}
	public void prn() {
		int su3 = 10;
		//static int su4 = 10;//������������ static�� ����� �� ����.
		
	}
	//static �޼���� static ������ ������ �� �ִ�.
	public static void prn2() {
//		System.out.println(su1);static�޼���� instance������ ����� �� ����.
		System.out.println(su2);
		int su4  = 10;
//		static int su5 = 10;//������������ static�� ����� �� ����.
	}
}
