package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//finally 예외가 처리와 상관 없이 무조건 수행하는 영역
		//		  
		//try ~ catch ~ finally (DB, 입출력, 네트워크에서 주로 사용)
		Scanner sc  = new Scanner(System.in);int var = 3;
		
		try {
			System.out.println("정수입력: ");
			int su = sc.nextInt();
			System.out.println("정답: "+(var/su));
			return ;//return을 하면 main을 호출한 jvm으로 돌아가게 되고 이는 프로그램의 종료를 의미한다.
		} catch (Exception e) {
			System.out.println(e+"오류입니다.");
		}finally {
			System.out.println("반드시 수행해야 할 문장");//main이 JVM에의해 종료를 하더라도 이 문장은 수행하고 종료한다.
		}
		System.out.println("수고하셨습니다.");
	}
}
