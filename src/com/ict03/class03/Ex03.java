package com.ict03.class03;

public class Ex03 extends Ex02{
	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";

	public Ex03() {
		//super();��������
		System.out.println("�ڽ� Ŭ���� ������"+this);
	}
	public void sound() {
		System.out.println("�ڽ� Ŭ���� �޼���");
	}
	public void study() {
		//��ü ���� ���� �θ�Ŭ������ �ɹ��� ����� ��
		System.out.println("������� : "+addr);
		//���������� �ִ��� ������ �Ǵ� -> ���������� �ִ��� ������ �Ǵ� -> ��Ӱ��� Ŭ���� Ȯ��
		System.out.println("name : "+this.name);//���θ�
		System.out.println("super name : "+super.name);//������
		
		//System.out.println(dog); ��Ӱ��迩�� private�� ����� �� ����.
	}
	//�������̵�(������) : �θ� �޼��带 �Ѹ���� �״�� ����ϴ� ��
	//�������̵��� �Ҽ� ���� ����� ����� : final 
	//�θ�޼��忡 final�� ������ �������̵��� �� �� ����.
	//�������̵��� �ݴ�� final
	
	//������ �ٸ� ������.
	//�����ε� : **������**�� �Ű������� �پ��ϰ� �޾Ƽ� �ϳ��� �޼��带 �پ��ϰ� �����ϴ� ��
	@Override
	public void eat() {
		System.out.println("��ħ�Ļ�� �Ÿ���.");
	}
	
	

}
