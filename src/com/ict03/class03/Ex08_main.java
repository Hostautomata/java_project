package com.ict03.class03;

public class Ex08_main {
	public static void main(String[] args) {
		//�Ϲ����� ��ü ����
				Ex06_MP3 mp3 = new Ex06_MP3();
				mp3.call();
				System.out.println("������: "+mp3.s_sms);
				mp3.sms();
				System.out.println("������: "+mp3.s_sms);

				mp3.sound();
				
				Ex07_DC dca = new Ex07_DC();
				dca.call();
				
				System.out.println("������: "+dca.s_sms);
				dca.sms();
				System.out.println("������: "+dca.s_sms);
				dca.picture();
				System.out.println("=======================");
				//������迡�� �θ�Ŭ������ ������ ������ �� �ִ�.
				//��, �ڽ� Ŭ������ �޼��带 ����� �� ����.
				//p1�� Ex06_MP3Ŭ������ ���� �޼����� sound()�� ����� �� ����.
				Ex05 p1 = new Ex06_MP3();
				p1.call();
				p1.sms();
				System.out.println(p1.s_sms);
				//p1.sound(); �����߻�
				
	}
	
}
