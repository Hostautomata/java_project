package com.ict03.class07;
//3. Static ���� Ŭ����
public class Ex04 {
	String name = "ȫ�浿";
	private int age = 24;
	static String addr = "���ֵ�";
	
	public Ex04() {
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
	public static class Inner03{
		String name = "ȫ����";
		final int i2 = 10;
		//����Ŭ���������� static�� ������ -> �� �ٿ��� �ڴٸ� static����Ŭ���� ���
		static int i3 = 20;
		static final int i4 = 30;
		//���� Ŭ���� ������
		public Inner03() {
			System.out.println("����Ŭ���� ������"+this);
		}
		//����Ŭ������ �ܺ�Ŭ������ �ɹ� �ʵ�� �޼��带 ������� ��밡���ϴ�.
		//���� Ŭ���� �޼���
		public void play() {
			int money = 10000;
			System.out.println("�̸�: "+name);
			System.out.println("�ݾ�: "+money);
			//�ܺ�Ŭ������ �ʵ� static�� �ٿ��� �Ѵ�.
			//System.out.println("����: "+age);
			System.out.println("�ּ�: "+addr);
			//�ܺ� Ŭ���� �޼���
			//sound();
		}
	}
	
}
