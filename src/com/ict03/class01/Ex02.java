package com.ict03.class01;

public class Ex02 {
	
	//Ŭ���� �ȿ��� �������� �����Ѵ�.
	// �ɹ� �ʵ�, �ɹ� �޼���, ������
	//�ɹ� �ʵ� : ����� ����, static�� instance�� ����.
	int k1 = 80;				//�ν��Ͻ� ����
	static int k2 = 90;			//static����
	final int K3 = 85;			//�ν��Ͻ� ���
	static final int K4 = 95;	//static ��� = API���� �����ϴ� ��� ����
	//Ŭ������ ��ü�� ������� �� ���� ������� : instance
	//��ü ������ ���þ��� �̸� ��������� ��
	//�޼���� �ڱ⸦ ȣ���� ������ �ǵ��ư���.(main->jvm)	
	//�ɹ� �޼��� : ����, ���
		
	public void prn01(){//instance, ��ȯX
		
		k1 = k1 + 20;
		k2 = k2 + 10;
		
		System.out.println("k1 = "+k1);
		System.out.println("k2 = "+k2);
//		final�� ������ ����̴�. ����� �� ������ �� �� ����. ���� ���� �߻�
//		K3 = K3 + 15; 
//		K4 = K4 + 5;
		
		//�������� : �޼��� �ȿ��� ������� ����
		//			�޼��� �ȿ��� ������� ������ �޼��带 ȣ�� �� �� �����ȴ�. 
		//			�޼��尡 ������ �������.
		//			���������� static�� ���� �� ����.(static�� ��ü�� ���þ��� �̸� ������ �ϱ� ������)
		int s1 = 10;
//		static int s2 = 90;
		final int s3 = 85;
//		static final int s4 = 95;
		
	}
	public static void prn02() {//static, ��ȯX
//		static�޼��忡���� �ν��Ͻ� ������ ��� �� �� ����.
//		k1 = k1 + 20;
		k2 = k2 + 10;
//		K3 = K3 + 15;
		
		System.out.println("k2 = "+k2+", K4 = "+K4);
//		���������� static�� ���� �� ����.
		int s1 = 10;
//		static int s2 = 90;
		final int s3 = 85;
//		static final int s4 = 95;
		
		return ;//��ȯ�� �� �� ������ �����ʹ� ��ȯ���� ����
	}
	//static����, void����
	public int prn03() {//instance, ��ȯO
		//return 14; //��ȯ������ �۰ų� ���� �ڷ����� ����Ͽ��� �Ѵ�.
		return 'c';
		
	}
	public static double prn4() {//static, ��ȯO
		return 147;
		//return 3.14;
	}
}
