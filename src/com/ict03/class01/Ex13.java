package com.ict03.class01;

public class Ex13 {
	
	private String name = "����";
	private int age = 3;
	private String addr = "����";
	
	//������ �����ε�
	//�⺻������ : ctrl + space bar
	public Ex13(){
		//this : class�ȿ��� �ڱ� �ڽ��� ��Ī�ϴ� �����
		//this ���� : ��������
		//this() : �����ڰ� �����ڸ� ȣ���� �� ����ϴ� ������̴�.
		//		   �ݵ�� ������ ù �ٿ��� ��� �����ϴ�.
		this("������",21,"����");	
		System.out.println("�⺻������ : "+this);
		//System.out.println(this.name);
	}
	//�޼��峪 ������(��������)�� ȣ���� �ؾ� ���������.
	
	public Ex13(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Ex13(int age, String name) {
		this(name, age,"����");
	}

	public Ex13(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("4��° ������");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}