package com.ict03.class06;
enum Type{
	WALKING, RUNNING, TRACKING, HIKING
}
public class Ex02 {
	String name ;
	int size;
	Type type;//enum�� �ڷ������� ����.

	public static void main(String[] args) {
		//��ü�� ����� Ŭ������ �ɹ������� ����� �� �ִ�.
		Ex02 shose = new Ex02();
		shose.name = "����Ű";
		System.out.println(shose.name);
		
		shose.size = 275;
		shose.type = Type.RUNNING;
		System.out.println("�Ź� �̸� : "+shose.name);
		System.out.println("�Ź� ������ : "+shose.size);
		System.out.println("�Ź� Ÿ�� : "+shose.type);
	}
}
