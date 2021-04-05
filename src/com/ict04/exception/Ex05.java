package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//throws(예외 양도/ 예외 전가) : 현재 메서드에서 예외처리를 하기가 조금 어려운 상태일 때
		//현재 영역을 호출한 곳으로 발생한 예외 객체를 대신 처리해 달라고 양도하는 것
		//양도를 계속 하다보면 결국 main까지 오기 때문에 근본적인 처리를 할 수 없다.
		//나중에라도 예외처리(try~catch)를 하는 편이 좋다.
		
		Ex05 test = new Ex05();
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : " );
		
		try {
			//입력 받는 쪽에서 처리를 하도록 메서드들이 미뤘음.
			String msg = sc.next();
			test.setData(msg);
		} catch (NumberFormatException e) {
			System.out.println("첫 글자는 숫자로 입력하세요!");
		}
		
	}
	public void setData(String msg) throws NumberFormatException{
		if(msg.length()>=1) {//msg의 글자 길이가 1글자 이상일 경우 실행
			String str = msg.substring(0,1);//첫글자를 추출해라.
			prnData(str);
			
		}
	}
	public void prnData(String str) throws NumberFormatException{
		
		int dan = Integer.parseInt(str);
		
		System.out.println(dan+"단");
		for(int i = 1; i <10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
}
