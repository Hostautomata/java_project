package com.ict04.exception;

public class Ex01 {

	public static void main(String[] args) {
		// java에서 예외처리란 예상한 오류가 발생하면 무조건 프로그램을 종료시킨다.
		// 그러나 가벼운 예외나 예상된 예외를 별도로 처리하는 방법을 사용하면 
		// 무조건 프로그램이 종료되는 것이 아니라 정상종료를 할 수 있도록 하는 방법을 예외처리라고 한다.
		// 추가내용
				
		//예외처리 : try ~ catch
		//목적 : 비 정상적인 종료를 정상적인 종료로 유도
		// 		예외 발생 시 예외에 대한 처리를 해준다.
		//형식 : try{
		//			예외가 발생할 수 있는 문장;		
		//			예외가 발생 할 수 있는 문장;		
		//			예외가 발생할 수 있는 문장;		
		//			
		//		}catch(예외발생 객체 e){
		//			예외 발생시 처리할 문장;
		//		}
		try {
			int[] var = {10,20,30};
			for(int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var["+i+"] = "+var[i]);
				System.out.println(3);
				System.out.println(4);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("수고 하셨습니다.");
		
	}
}
