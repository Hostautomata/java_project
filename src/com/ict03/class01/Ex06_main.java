package com.ict03.class01;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 test = new Ex06();
		String name = test.k1();
		int age = test.k2();
		double height = test.k3();
		char rank = test.k4();
		
		System.out.println("�̸� : "+name+" ���� : "+age+"\nŰ : "+height+" ��ũ : "+rank);

		Scanner sc = new Scanner(System.in);


			System.out.print("�̸� : ");
			String r1 = sc.next();
			System.out.print("���� : ");
			int r2 = sc.nextInt();
			System.out.print("Ű : ");	
			double r3 = sc.nextDouble();
			System.out.print("��ũ : ");		
			char r4 = (char)sc.next().charAt(0);
			
			test.m1(r1);
			test.m2(r2);
			test.m3(r3);
			test.m4(r4);
			
			name = test.k1();
			age = test.k2();
			height = test.k3();
			rank = (char)test.k4();
			System.out.print("�̸� : "+name+" ���� : "+age+"\nŰ : "+height+" ��ũ : "+rank);
			
			
	}
}
