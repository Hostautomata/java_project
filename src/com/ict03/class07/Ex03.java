package com.ict03.class07;

public class Ex03 {
	// 2.Local ���� Ŭ����
	String name = "�Ѹ�";
	int hight = 160;
	public Ex03() {

		System.out.println("�ܺ� : " + this);

	}

	public void sound() {
		String addr = "����";
		System.out.println("ȣ��!");

	}

	// ����Ŭ������ ���� �޼���
	public void play() {
		int age = 24;
		class Inner02 {
			String name = "����";
			int time = 36;

			public Inner02() {
				System.out.println("����: " + this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(hight);
				//�ڱⰡ ���� �޼��尡 �ƴϱ� ������ ��� ����
				//System.out.println(addr);
				System.out.println(time);
				System.out.println(age);
			}//���� �޼��� ��
		}//���� Ŭ���� ��
		Inner02 in02  = new Inner02();
		//�ܺ� �ɹ�
		System.out.println(name);
		//�ܺ� �޼���
		sound();
		//���θ޼���
		in02.hobby();
		
		
	}	//�ܺ� �޼��� ��
}
