package com.ict03.class01;

public class Ex07 {
	private String name = "�Ѹ�";
	private int age = 13;
	private double height = 135.15;
	private boolean human = false;
	private char rank = 'A';

	//getter/setter ȣ�� => �޴�-Source->generate getter&setter
	//*VO(value object ������ ���� ��ü)�� �ַλ��
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}//��������(�Ķ�)�� ��������(���)�� �̸��� ���� ��� this�� ������ �̸� ������ �� ����.
	//���� ���������� this�� ����.
	//���������� ���������� �̸��� ���� �� �켱������ ���������� ����.
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isHuman() {//API�� �����ϱ� ������ boolean���� get�� �ƴ϶�is�� �ٴ´�.
		return human;
	}
	public void setHuman(boolean human) {
		this.human = human;
	}
	public char getRank() {
		return rank;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
	
}
