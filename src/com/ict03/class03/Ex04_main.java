package com.ict03.class03;

public class Ex04_main {
	public static void main(String[] args) {
		Ex03 t1 = new Ex03();
		//�θ�Ŭ������ ���� ���������
		//�ڽ�Ŭ������ �������
		//super();�� �θ� Ŭ���� ȣ��
		//�� �� 
		System.out.println(t1);
		//�θ�� �ڽ��� ���� ���� ������ ������
		//�ڽ��� �ɹ��� ���� ���
		System.out.println(t1.name);
		//�ڽĿ��� ���� �ɹ��� �θ𿡰� �ִ� �ɹ� ���
		System.out.println(t1.addr);
		
		//�޼��嵵 ���������̴�.
		t1.sound();
		t1.prn();
		System.out.println("--------------");
		//static ��ü������ ���� X
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		//�ڽİ� �θ� ���� �޼��带 ������ ������ 
		//�ڽ� �޼��带 �����Ѵ�.
		t1.eat();
		t1.walk();
	}
}
