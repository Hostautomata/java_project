package com.ict02.array;

public class Ex02 {
	public static void main(String[] args) {
		//선언-생성-데이터 저장
		//선언+생성
		char[] c1 = new char[4];
		c1[0]='J';
		c1[1]='A';
		c1[2]='V';
		c1[3]=65;//0~65535 char 범위(벗어나면 오류)
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		//선언+생성+데이터 저장
			
	
		}
		String[] msg = {"java","jsp","android"};
		for (int i = 0; i < msg.length; i++) {
			System.out.println(msg[i]);
		}
	}
}
