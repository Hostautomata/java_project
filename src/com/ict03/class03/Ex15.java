package com.ict03.class03;

public class Ex15 extends Ex14{
	
	String name = "ȫ����";
	int id = 2410;
	
	public Ex15() {
		super("������",15);//�θ�Ŭ���� ������ ȣ��
		System.out.println("�ڽ�Ŭ���� "+this.name+" ����");
		name = "ȫ�β�";
		id = 1004;
	}

	public Ex15(String name) {
		super("�±Ǻ���",32);
		this.name = name;
	}
	public void prn() {
		String name = "ȫ��";
		//��������, ��������, �θ� ��� ���� �̸��� ����name�� ������ �ִ�.
		System.out.println("�������� "+name);
		System.out.println("�������� "+this.name);
		System.out.println("�θ𺯼� "+super.name);
		//�θ� �������ִ� ���� : ���� �� �ʿ� X
		System.out.println("�������� "+age);
		System.out.println("�������� "+this.age);
		System.out.println("�θ𺯼� "+super.age);
		
		//���������� �������ִ� ����id �θ𿡴� id�� ���� ������ super ����
		System.out.println("�������� "+id);
		System.out.println("�������� "+this.id);
		//System.out.println("�θ𺯼� "+super.id); 
		
	}
}
