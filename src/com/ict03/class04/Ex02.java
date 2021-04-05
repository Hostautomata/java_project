package com.ict03.class04;
//일반적인 클래스는 추상클래스를 상속하면 반드시 추상클래스의 추상메서드를 오버라이딩 해야 한다.
class Ex02 extends Ex01 {
	@Override
	public void sound() {
		
	}

}


//오버라이딩을 하지 않는 방법 : 자식 클래스를 추상클래스로 만들기
//부모의 추상 메서드를 구체화 하지 않음.
abstract class Ex03 extends Ex01{
	public void song() {
		System.out.println("song");
	}
}

//부모의 추상 클래스를 구체화 하지도 않았고
// 자기만의 추상메서드를 생성
abstract class Ex04 extends Ex01{
	public void Music() {
		System.out.println("Music");
	}
	public abstract void pop();
}


