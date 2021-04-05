package com.ict03.class05;

public interface Ex01 {
	//인터페이스는 서비스를 제공하는 목록과 같은 것이다.
	//상수와 추상 메서드로 이루어져 있다.
	//생성자가 없다.(객체 생성이 안된다) -> 사용을 못한다. -> 다중상속 가능
	//실제 사용하기 위해서는 인터페이스를 상속받는 클래스가 있고
	//상속받는 클래스를 사용하는 것이다.
	//**'인터페이스가 같다'라는 것은 호환이 가능하다 라는 것이다.**

	//인터페이스는 모두 상수와 추상메서드만 가지고 있다.
	//아래 맴버 필드는 전부 상수(static final이 생략되어있음)
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;

	//추상메서드가 아니므로 오류발생
	//public void play() {};
	
	
	//추상메서드 형태
	public abstract void like();
	//interface내에서 abstract예약어를 생략해도 된다.
	public void sound();
}
