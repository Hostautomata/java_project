package com.ict02.array;

public class Ex01 {

	public static void main(String[] args) {
		//�迭 : ���� �ڷ������� �����͸� �� ���� ��Ƶ� ����
		//		�����ÿ� ũ�⸦ �����ؾ� ��. �迭�� ũ��� ������ �� ����.
		//		�迭��½ÿ� �Ϲ������� for���� �����
		//		����-����-������ ����
		//		����: �ڷ���[] �̸�; || �ڷ��� �̸�[];
		//		����:	 �̸� = new �ڷ���[ũ��]; 
		//		new�� �޸𸮿� �����͸� ���� �� ������ ������ ����� �̴�.(=�ν��Ͻ�, ��ü ����, ��üȭ)
		//		����: �̸�[�ε���] = ������; �̶� �����ʹ� ���� �ڷ��� �̾�� �Ѵ�.
		int[] su;
		su = new int[5];
		su[0] = 123;
		su[1] = 'j';
//		su[2] = 3.14;	�ڷ����� ������ �ڷ��� ���� ũ�� ������ ������ �ȵ�.
//		su[3] = true;
//		su[4] = "j";
		su[2] = 321;
		su[3] = 456;
		su[4] = 654;
		
		
		
		System.out.println(su);//stack���� su�� �������ִ� �迭�� �ּڰ�
		
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println(su[4]);
		System.out.println();
		
		for(int i = 0; i < su.length;i++) {
			System.out.println(su[i]);
		}
		
		
		
		
	}
}
