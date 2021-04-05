package com.ict03.class03;

public class Ex15 extends Ex14{
	
	String name = "홍일점";
	int id = 2410;
	
	public Ex15() {
		super("일지매",15);//부모클래스 생성자 호출
		System.out.println("자식클래스 "+this.name+" 생성");
		name = "홍두께";
		id = 1004;
	}

	public Ex15(String name) {
		super("태권브이",32);
		this.name = name;
	}
	public void prn() {
		String name = "홍시";
		//지역변수, 전역변수, 부모 모두 같은 이름의 변수name을 가지고 있다.
		System.out.println("지역변수 "+name);
		System.out.println("전역변수 "+this.name);
		System.out.println("부모변수 "+super.name);
		//부모만 가지고있는 변수 : 구분 할 필요 X
		System.out.println("지역변수 "+age);
		System.out.println("전역변수 "+this.age);
		System.out.println("부모변수 "+super.age);
		
		//전역변수만 가지고있는 변수id 부모에는 id가 없기 때문에 super 오류
		System.out.println("지역변수 "+id);
		System.out.println("전역변수 "+this.id);
		//System.out.println("부모변수 "+super.id); 
		
	}
}
