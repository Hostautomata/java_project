package com.ict03.class07;
//1. Member ���� Ŭ����
public class Ex02 {
	String name = "ȫ�浿";
	private int age = 24;
	static String addr = "���ֵ�";
	
	public Ex02() {
		System.out.println("�ܺ� Ŭ������ ������ : "+this);
	}
	public void sound() {
		int money = 1000;
		final int time = 2;
		//���������� static�� ����
//		static int number = 12;
//		static final int number2 = 12;
		System.out.println("�ܺ� Ŭ������ �޼��� : "+name+", money: "+money);
		
	}
	public class Inner01{
		String name = "ȫ����";
		final int i2 = 10;
		//����Ŭ���������� static�� ������ -> �� �ٿ��� �ڴٸ� static����Ŭ���� ���
		//static int i3 = 20;
		static final int i4 = 30;
		//���� Ŭ���� ������
		public Inner01() {
			System.out.println("����Ŭ���� ������"+this);
		}
		//����Ŭ������ �ܺ�Ŭ������ �ɹ� �ʵ�� �޼��带 ������� ��밡���ϴ�.
		//���� Ŭ���� �޼���
		public void play() {
			int money = 10000;
			System.out.println("�̸�: "+name);
			System.out.println("�ݾ�: "+money);
			//private��밡��
			System.out.println("����: "+age);
			System.out.println("�ּ�: "+addr);
			//�ܺ� Ŭ���� �޼���
			sound();
		}
	}
	
}
