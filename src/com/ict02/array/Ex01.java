package com.ict02.array;

public class Ex01 {

	public static void main(String[] args) {
		//배열 : 같은 자료형들의 데이터를 한 곳에 모아둔 묶음
		//		생성시에 크기를 지정해야 함. 배열의 크기는 변경할 수 없다.
		//		배열출력시에 일반적으로 for문을 사용함
		//		선언-생성-데이터 저장
		//		선언: 자료형[] 이름; || 자료형 이름[];
		//		생성:	 이름 = new 자료형[크기]; 
		//		new는 메모리에 데이터를 저장 할 공간을 만들라는 예약어 이다.(=인스턴스, 객체 생성, 객체화)
		//		저장: 이름[인덱스] = 데이터; 이때 데이터는 같은 자료형 이어야 한다.
		int[] su;
		su = new int[5];
		su[0] = 123;
		su[1] = 'j';
//		su[2] = 3.14;	자료형이 선언한 자료형 보다 크면 데이터 저장이 안됨.
//		su[3] = true;
//		su[4] = "j";
		su[2] = 321;
		su[3] = 456;
		su[4] = 654;
		
		
		
		System.out.println(su);//stack영역 su가 가지고있는 배열의 주솟값
		
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println(su[4]);
		System.out.println();
		
		for(int i = 0; i < su.length;i++) {
			System.out.println(su[i]);
		}
		
		
		
		
	}
}
