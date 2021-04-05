package com.ict03.class02;

import java.util.Scanner;

public class HwPhoneNumberXXX {
	public static void main(String[] args) {
		// 숙제) 010-7777-9999 => 010-xxxX-9999, 010-7777-xxxx만들어보기
		Scanner sc = new Scanner(System.in);
		System.out.println("//////////////////////");
		String phone = "010-7777-9999";
		String fir = phone.substring(0, phone.indexOf('-'));
		String sec = phone.substring(phone.indexOf('-') + 1, phone.lastIndexOf('-'));
		String last = phone.substring(phone.lastIndexOf('-') + 1);
		System.out.println("숨길 자리를 선택하세요 (1)/(2)/(3)");
		int xx = sc.nextInt();
		switch (xx) {
		case 1: {
			fir = "XXXX";
			break;
		}
		case 2: {
			sec = "XXXX";
			break;
		}
		case 3: {
			last = "XXXX";
			break;
		}
		}
		
		
		System.out.println(fir + "-" + sec + "-" + last);
		System.out.println("++++++++++++++++++++++");
	}
}
