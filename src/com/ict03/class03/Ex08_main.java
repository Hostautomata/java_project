package com.ict03.class03;

public class Ex08_main {
	public static void main(String[] args) {
		//일반적인 객체 생성
				Ex06_MP3 mp3 = new Ex06_MP3();
				mp3.call();
				System.out.println("실행전: "+mp3.s_sms);
				mp3.sms();
				System.out.println("실행후: "+mp3.s_sms);

				mp3.sound();
				
				Ex07_DC dca = new Ex07_DC();
				dca.call();
				
				System.out.println("실행전: "+dca.s_sms);
				dca.sms();
				System.out.println("실행후: "+dca.s_sms);
				dca.picture();
				System.out.println("=======================");
				//실행관계에서 부모클래스를 가지고 선언할 수 있다.
				//단, 자식 클래스의 메서드를 사용할 수 없다.
				//p1은 Ex06_MP3클래스의 고유 메서드인 sound()는 사용할 수 없다.
				Ex05 p1 = new Ex06_MP3();
				p1.call();
				p1.sms();
				System.out.println(p1.s_sms);
				//p1.sound(); 오류발생
				
	}
	
}
