package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {
		//static �������� ��ü ������ ������� �̸� ���������.
		//ȣ���� Ŭ�����̸�.�޼���, Ŭ�����̸�.����
		//System.out.println(Ex02.k1);//�ν��Ͻ�
		System.out.println(Ex02.k2);
		//System.out.println(Ex02.K3);//�ν��Ͻ�
		System.out.println(Ex02.K4);
		
		//��ȯ���� ���� �޴� ����� �޶�����.
		//void�� ��� �����Ͱ� �Ѿ���� �ʱ� ������ ���� �ʿ䰡 ����.
		Ex02.prn02();
		
		//void�� �ƴ� ��� �ݵ�� ��ȯ���� ���缭 ��������.
		double su1 = Ex02.prn4();
		System.out.println(su1);
		System.out.println("--��ü ���� ����--");
		
		//1.Ex02 Ŭ������ ����ϱ� ���ؼ� Ŭ������ ��ü�� ������ ��.
//		Ex02Ŭ������ �����ڰ� �������� �����Ƿ� �⺻�����ڷ� ��ü����
//		�⺻�����ڶ� �μ�=�Ű������� ���� �����ڸ� �ǹ�(Ŭ�����̸�())
		//Ŭ���� �������� = new ������();
		Ex02 test = new Ex02();
		//�ּ�
		System.out.println(test);	
		System.out.println(test.k1);
		System.out.println(test.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		
		//�޼��� ����
		
		test.prn01();
		
		test.prn02();
		Ex02.prn02();
		
		int su2 = test.prn03();
		System.out.println(su2);
		
		double su3 =test.prn4();
		double su4 = Ex02.prn4();
		
		System.out.println(su3);
	}
}
//1. main�� ����ȴ� static�������� static�޼���� ������ �����Ѵ�.
//2. Ŭ������ �̿��ؼ� ��ü�� �����.
//3. Heap�������� instance�������� �����Ѵ�.
//4. Heap�������� Static������ �ߺ��Ǵ� �������� �ּڰ��� �����Ѵ�.