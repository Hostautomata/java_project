package com.ict01.grammer02;
class Test01{
	public static void main(String[] args){
		//�̸��� ȫ�浿�� ����� ����:90 ����:80 ����:90
		String name = "ȫ�浿";
		double ko = 90.0;
		double en = 80.0;
		double ma = 90.0;
		
		int sum = (int)(ko+en+ma);

		double av = sum/3;
		double avr = (int)(av*10)/10.0;
		System.out.println("�̸�: "+name);
		System.out.println("����: "+sum);
		System.out.println("���: "+avr);
		
	}
}