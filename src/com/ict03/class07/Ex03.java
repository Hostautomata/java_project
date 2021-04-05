package com.ict03.class07;

public class Ex03 {
	// 2.Local 내부 클래스
	String name = "둘리";
	int hight = 160;
	public Ex03() {

		System.out.println("외부 : " + this);

	}

	public void sound() {
		String addr = "서울";
		System.out.println("호잇!");

	}

	// 내부클래스를 담은 메서드
	public void play() {
		int age = 24;
		class Inner02 {
			String name = "희동이";
			int time = 36;

			public Inner02() {
				System.out.println("내부: " + this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(hight);
				//자기가 속한 메서드가 아니기 때문에 사용 못함
				//System.out.println(addr);
				System.out.println(time);
				System.out.println(age);
			}//내부 메서드 끝
		}//내부 클래스 끝
		Inner02 in02  = new Inner02();
		//외부 맴버
		System.out.println(name);
		//외부 메서드
		sound();
		//내부메서드
		in02.hobby();
		
		
	}	//외부 메서드 끝
}
