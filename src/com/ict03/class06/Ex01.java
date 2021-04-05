package com.ict03.class06;
//열거형(enum) : 상수를 하나의 객체로 인식하고,

import java.util.Iterator;

//				여러개의 상수 객체들을 한 곳에 모아 둔 하나의 묶음(객체)

public class Ex01 {
	static final int JAVA = 100;
	static final int DB = 200;

	// 열거형
	public enum Lesson {
		JAVA, JSP, SPRING, ANDROID, HTML
	}

	public static void main(String[] args) {
		//일반적인 상수 호출		
		System.out.println("JAVA: " + Ex01.JAVA);
		//enum호출
		System.out.println("enum JAVA : "+ Lesson.JAVA);
		
		Lesson[] arr = Lesson.values();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+": "+arr[i].ordinal());
		}System.out.println();
	}
	
}
