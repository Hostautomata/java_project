package com.ict03.class07;

import com.ict03.class07.Ex02.Inner01;

public class Ex02_main {
	public static void main(String[] args) {
		
		Ex02 t1 = new Ex02();
		//�ܺθ� ���ؼ� ����Ŭ���� ����
		//����Ŭ���� �ּҿ��� '$'�� �ִ�.Ex02$Inner01@5d22bbb7
		Ex02.Inner01 t2 = t1.new Inner01();
		
		System.out.println(t2.name);
		System.out.println(t2.i2);
		System.out.println(t2.i4);
		System.out.println();
		t2.play();
	}
}
