package com.ict03.class02;

import java.util.Scanner;

public class HwPhoneNumberXXX {
	public static void main(String[] args) {
		// ����) 010-7777-9999 => 010-xxxX-9999, 010-7777-xxxx������
		Scanner sc = new Scanner(System.in);
		System.out.println("//////////////////////");
		String phone = "010-7777-9999";
		String fir = phone.substring(0, phone.indexOf('-'));
		String sec = phone.substring(phone.indexOf('-') + 1, phone.lastIndexOf('-'));
		String last = phone.substring(phone.lastIndexOf('-') + 1);
		System.out.println("���� �ڸ��� �����ϼ��� (1)/(2)/(3)");
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
