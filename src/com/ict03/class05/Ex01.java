package com.ict03.class05;

public interface Ex01 {
	//�������̽��� ���񽺸� �����ϴ� ��ϰ� ���� ���̴�.
	//����� �߻� �޼���� �̷���� �ִ�.
	//�����ڰ� ����.(��ü ������ �ȵȴ�) -> ����� ���Ѵ�. -> ���߻�� ����
	//���� ����ϱ� ���ؼ��� �������̽��� ��ӹ޴� Ŭ������ �ְ�
	//��ӹ޴� Ŭ������ ����ϴ� ���̴�.
	//**'�������̽��� ����'��� ���� ȣȯ�� �����ϴ� ��� ���̴�.**

	//�������̽��� ��� ����� �߻�޼��常 ������ �ִ�.
	//�Ʒ� �ɹ� �ʵ�� ���� ���(static final�� �����Ǿ�����)
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;

	//�߻�޼��尡 �ƴϹǷ� �����߻�
	//public void play() {};
	
	
	//�߻�޼��� ����
	public abstract void like();
	//interface������ abstract���� �����ص� �ȴ�.
	public void sound();
}