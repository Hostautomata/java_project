package com.ict03.class04;

public abstract class Ex01 {
	//�߻� Ŭ���� : �߻�޼��带 �ϳ��̻� ������ �ִ� Ŭ����
	//			�Ϲ����� �޼��峪 �ʵ嵵 ���� �� �ִ�.
	//			�߻�Ŭ������ abstract ���� ����Ѵ�.
	
	//Ʋ�� �Ѹ��� ���
	
	//�߻� �޼��� : ��üȭ ���� ���� �޼���
	//			body ���� �������� �ʴ� �޼���
	//			= ���๮�� ����.=��üȭ ���� �ʾҴ�.
	//			�߻�޼��忡�� �ݵ�� abstractd���� ����Ѵ�.
	
	// ������ : �ϳ��� �޼��峪 Ŭ������ ���� �� �� �͵��� �پ��� ������� ���� ��Ű�� ��
	int s1 =10;					//�ν��Ͻ�����
	static int s2 = 10;			//static����
	final int s3 = 10;			//�ν��Ͻ����
	static final int s4 = 10;	//static���
	
	public void play() {
		System.out.println("�ν��Ͻ� �޼���");
	}
	public static void prn() {
		System.out.println("static�޼���");
	}
	//�߻� �޼���
	public abstract void sound();
	
	
	
	
}
