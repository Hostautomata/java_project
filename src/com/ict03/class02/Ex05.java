package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
//		StringBuffer, StringBuilder ���ڿ��� ����ϰ� ����, ����, �߰� �� ��� ����� �����Ѵ�.
		

//		String �� �Һ��̴�. �׷��� ���� ��ȭ�� �ְԵǸ� 
//		�޸𸮿� ���ο� ������ ����� �� ���� �����ϰ� �ȴ�.
//		�� �������� ������ ���� ������ ������ ä�� �����Ⱚ�� �Ǿ� ���´�.
		
		String msg = "hello";
		System.out.println(msg);
		
		msg += " java";//���ο� ������ hello java ����
		System.out.println(msg);
		
//		StringBuffer�� StringBuilder�� �������̱� ������ append�� ����ϸ�
//		���� String���� �޸� �޺κп� ���ڿ��� �߰��Ͽ� ���δ�.

		//������ �߰��� ��(append("���ڿ�"))
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb);
		sb.append(" JAVA");//�޺κп� JAVA �߰�
		System.out.println(sb);
	}
}
