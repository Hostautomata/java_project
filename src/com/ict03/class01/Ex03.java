package com.ict03.class01;

public class Ex03 {
	//�޼��� : ���, ����
	// 		**�޼��带 ȣ���ϸ� �ش� �޼��尡 ����ȴ�.
	//		**������ ������ �޼��带 ȣ���� ������ �ǵ��ư���.
	//		**�ǵ��ư� �� ����� �������� ���� �ƴѰ��(void)�� ������.
	//		��ȯ���� �ִ� ��� �ݵ�� return+���� ������ �� �������� �־�� �Ѵ�.

	int s1 = 10;
	int s2 = 5;
	int result = 0;
	//		��ȯ�� ����
	public void plus01() {
		System.out.println(2);
		result = s1 + s2;
	}
	
	//		��ȯ���� �ִ� ���
	public int sub01() {
		int res = s1 - s2;
		return res;
	}
	
	
}
