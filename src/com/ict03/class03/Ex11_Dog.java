package com.ict03.class03;

public class Ex11_Dog extends Ex09_Animal{
	String name = "�����";
	int age = 3;
	
	public void hobby() {
		System.out.println("�Ź� ���� ���");
	}
	@Override//������̼�(�ǹ��ִ� �ּ� JVM�� �ν���)
	public void sound() {
		System.out.println("�п�");
		super.sound();
	}
}
