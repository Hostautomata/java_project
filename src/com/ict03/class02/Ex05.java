package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
//		StringBuffer, StringBuilder 문자열을 빈번하게 수정, 삭제, 추가 할 경우 사용을 권장한다.
		

//		String 은 불변이다. 그런데 값에 변화를 주게되면 
//		메모리에 새로운 영역을 만들어 그 값을 참조하게 된다.
//		이 과정에서 기존의 값은 공간을 차지한 채로 쓰레기값이 되어 남는다.
		
		String msg = "hello";
		System.out.println(msg);
		
		msg += " java";//새로운 영역에 hello java 생성
		System.out.println(msg);
		
//		StringBuffer나 StringBuilder는 가변적이기 때문에 append를 사용하면
//		기존 String문의 메모리 뒷부분에 문자열을 추가하여 붙인다.

		//내용을 추가할 때(append("문자열"))
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb);
		sb.append(" JAVA");//뒷부분에 JAVA 추가
		System.out.println(sb);
	}
}
