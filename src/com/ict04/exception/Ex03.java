package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//다중 catch문 : try문의 예외 발생이 여러가지의 예외가 발생할 경우 사용
		//주의 사항 : Exception을 사용할 때에는 반드시 아래쪽 catch문에서 사용한다.

		Scanner sc  = new Scanner(System.in);int var = 3;
//		try {
//			System.out.println("정수입력: ");
//			int su = sc.nextInt();
//			System.out.println("정답: "+(var/su));
//		} catch (InputMismatchException e) {
//			System.out.println("정수만 입력하세요");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("0으로는 숫자를 나눌 수 없습니다.");
//		}
		try {
			System.out.println("정수입력: ");
			int su = sc.nextInt();
			System.out.println("정답: "+(var/su));
		}
		catch (Exception e) {//Exception을 사용할 경우 맨 밑에만 사용합시다.
			System.out.println(e+"오류입니다.");
		}
		System.out.println("수고하셨습니다.");
	}
}
