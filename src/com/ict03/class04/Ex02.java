package com.ict03.class04;
//�Ϲ����� Ŭ������ �߻�Ŭ������ ����ϸ� �ݵ�� �߻�Ŭ������ �߻�޼��带 �������̵� �ؾ� �Ѵ�.
class Ex02 extends Ex01 {
	@Override
	public void sound() {
		
	}

}


//�������̵��� ���� �ʴ� ��� : �ڽ� Ŭ������ �߻�Ŭ������ �����
//�θ��� �߻� �޼��带 ��üȭ ���� ����.
abstract class Ex03 extends Ex01{
	public void song() {
		System.out.println("song");
	}
}

//�θ��� �߻� Ŭ������ ��üȭ ������ �ʾҰ�
// �ڱ⸸�� �߻�޼��带 ����
abstract class Ex04 extends Ex01{
	public void Music() {
		System.out.println("Music");
	}
	public abstract void pop();
}


